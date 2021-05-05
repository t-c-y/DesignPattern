package com.code.course.proxy;

/**
 * 代理模式
 */
public class ProxyPatternTest {

    public interface Subject {
        void request();
    }

    public static class CreateSubject implements Subject {

        @Override
        public void request() {
            System.out.println("执行请求");
        }
    }

    public static class Poxy implements Subject {

        private Subject subject;

        public Poxy(Subject subject) {
            this.subject = subject;
        }

        @Override
        public void request() {
            System.out.println("执行额外的条件");
            boolean invoke = true;
            if (invoke) {
                subject.request();
            }
        }
    }

    public static void main(String[] args) {
        Subject subject = new CreateSubject();
        Poxy poxy = new Poxy(subject);
        poxy.request();
    }

}
