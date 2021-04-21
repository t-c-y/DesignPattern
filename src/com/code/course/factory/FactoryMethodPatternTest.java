package com.code.course.factory;


/**
 * @author tcy
 */
public class FactoryMethodPatternTest {

    /**
     * 工厂方法模式
     *
     */

    public interface Product {
        void excute();
    }

    public static class Product1 implements Product {

        @Override
        public void excute() {
            System.out.println("产品1");
        }
    }

    public static class Product2 implements Product {

        @Override
        public void excute() {
            System.out.println("产品2");
        }
    }

    public static class Product3 implements Product {

        @Override
        public void excute() {
            System.out.println("产品3");
        }
    }

    public static abstract class AbstractProductFactory {

        public Product create() {
            common();
            return special();
        }

        public void common() {
            System.out.println("工厂公用");
        }

        public abstract Product special();

    }

    public static class Product1Factory extends AbstractProductFactory {

        private static final Product1Factory instance = new Product1Factory();

        private Product1Factory() {}

        public static Product1Factory get() {
            return instance;
        }

        @Override
        public Product special() {
            System.out.println("创建产品1");
            return new Product1();
        }
    }

    public static class Product2Factory extends AbstractProductFactory {

        private static final Product2Factory instance = new Product2Factory();

        private Product2Factory() {}

        public static Product2Factory get() {
            return instance;
        }

        @Override
        public Product special() {
            System.out.println("创建产品2");
            return new Product2();
        }
    }

    public static class Product3Factory extends AbstractProductFactory {

        private static final Product3Factory instance = new Product3Factory();

        private Product3Factory() {}

        public static Product3Factory get() {
            return instance;
        }

        @Override
        public Product special() {
            System.out.println("创建产品3");
            return new Product3();
        }
    }

    public static void main(String[] args) {
        Product p1 = Product1Factory.get().create();
        Product p2 = Product2Factory.get().create();
        Product p3 = Product3Factory.get().create();

        p1.excute();
        p2.excute();
        p3.excute();
    }

}
