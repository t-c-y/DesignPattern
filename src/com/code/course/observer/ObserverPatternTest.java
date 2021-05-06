package com.code.course.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * @author tongchengyu
 */
public class ObserverPatternTest {

    public static class Subject extends Observable {
        private Integer state;

        public Subject(int state) {
            this.state = state;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
            this.setChanged();
//            this.notifyObservers(state);
            this.notifyObservers();
        }
    }

    public static class ConcreteObserver implements Observer {

        /**
         * This method is called whenever the observed object is changed. An
         * application calls an <tt>Observable</tt> object's
         * <code>notifyObservers</code> method to have all the object's
         * observers notified of the change.
         *
         * @param o   the observable object.
         * @param arg an argument passed to the <code>notifyObservers</code>
         */
        @Override
        public void update(Observable o, Object arg) {
//			Integer state = (Integer) arg;
            Subject subject = (Subject) o;
            Integer state = subject.getState();
            System.out.println("目标对象的状态变化成：" + state);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject(0);
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.setState(1);
        subject.setState(2);
    }

}
