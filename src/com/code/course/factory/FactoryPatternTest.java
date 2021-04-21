package com.code.course.factory;

/**
 * @author tcy
 */
public class FactoryPatternTest {

    /**
     *
     * 简单工厂设计模式
     * 工厂模式的核心思想，其实就是不要自己在代码里手动new一个实现类对象出来，
     * 因为那样的话，调用方就不是面向接口编程了，你还得自己去care实现了
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

    public static class ProductFactory {
        public static Product create() {
            return new Product2();
//            return new Product1();
        }
    }

    public static void main(String[] args) {
        Product p = ProductFactory.create();
        p.excute();
    }

}
