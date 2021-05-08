package com.code.course.decorator;

/**
 * 装饰器模式
 * @author tongchengyu
 */
public class DecoratorPatternTest {

    public interface Component {
        void execute();
    }

    public static class ConcreteComponent implements Component {
        @Override
        public void execute() {
            System.out.println("执行基础功能");
        }
    }

    public static class Decorator implements Component {

        private Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void execute() {
            System.out.println("装饰器设计模式-开始");
            component.execute();
            System.out.println("装饰器设计模式-结束");

        }
    }

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new Decorator(component);
        decorator.execute();
    }

}
