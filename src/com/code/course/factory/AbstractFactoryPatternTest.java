package com.code.course.factory;

/**
 * @author tcy
 */
public class AbstractFactoryPatternTest {

    /**
     *
     * 抽象工厂模式
     *  场景：
     * （1）就是我们现在要生产的不是一个一个产品，而一个一个的产品组合
     * （2）比如说我们有产品ABC，现在第一种产品组合是A+B，第二种产品组合是B+C，第三种产品组合是A+Cs
     * （3）就是要对工厂模式进行进一步的增强
     */

    public interface ProductA {

        void execute();

    }

    public static class ProductA1 implements ProductA {

        public void execute() {
            System.out.println("产品A1的功能逻辑");
        }

    }

    public static class ProductA2 implements ProductA {

        public void execute() {
            System.out.println("产品A2的功能逻辑");
        }

    }

    public static class ProductA3 implements ProductA {

        public void execute() {
            System.out.println("产品A3的功能逻辑");
        }

    }

    public interface ProductB {

        void execute();

    }

    public static class ProductB1 implements ProductB {

        public void execute() {
            System.out.println("产品B1的功能逻辑");
        }

    }

    public static class ProductB2 implements ProductB {

        public void execute() {
            System.out.println("产品B2的功能逻辑");
        }

    }

    public static class ProductB3 implements ProductB {

        public void execute() {
            System.out.println("产品B3的功能逻辑");
        }

    }

    public interface Factory {
        ProductA createProductA();
        ProductB createProductB();
    }

    public static class Factory1 implements Factory {

        private static final Factory1 instance = new Factory1();

        private Factory1() {}

        public static Factory get() {
            return instance;
        }

        @Override
        public ProductA createProductA() {
            return new ProductA1();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB1();
        }
    }

    public static class Factory2 implements Factory {

        private static final Factory2 instance = new Factory2();

        private Factory2() {}

        public static Factory get() {
            return instance;
        }

        @Override
        public ProductA createProductA() {
            return new ProductA2();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB2();
        }
    }

    public static class Factory3 implements Factory {

        private static final Factory3 instance = new Factory3();

        private Factory3() {}

        public static Factory get() {
            return instance;
        }

        @Override
        public ProductA createProductA() {
            return new ProductA3();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB3();
        }
    }

    public static void main(String[] args) {
        ProductA pA1 = Factory1.get().createProductA();
        ProductB pB1 = Factory1.get().createProductB();
        pA1.execute();
        pB1.execute();

        ProductA pA2 = Factory2.get().createProductA();
        ProductB pB2 = Factory2.get().createProductB();
        pA2.execute();
        pB2.execute();

        ProductA pA3 = Factory3.get().createProductA();
        ProductB pB3 = Factory3.get().createProductB();
        pA3.execute();
        pB3.execute();
    }

}
