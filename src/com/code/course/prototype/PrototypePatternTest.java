package com.code.course.prototype;

/**
 * 原型模式
 * @author tongchengyu
 */
public class PrototypePatternTest {
    /**
     * 对象拷贝。不要每次手动实现拷贝，一旦对象有变动，还需要再调整所有拷贝的代码
     */
    public static void main(String[] args) {
        Product product = new Product("测试产品", new Component("测试组件"));
        System.out.println("product:" + product);
        Product copyProduct = (Product) product.clone();
        System.out.println("copyProduct:" + copyProduct);
    }

    /**
     * 组成
     */
    public static class Component {
        private String name;

        public Component(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Component{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public Object clone() {
            return new Component(getName());
        }
    }

    /**
     * 产品
     */
    public static class Product {
        private String name;
        private Component component;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Component getComponent() {
            return component;
        }

        public void setComponent(Component component) {
            this.component = component;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", component=" + component +
                    '}';
        }

        /**
         *
         * @param name
         * @param component
         */
        public Product(String name, Component component) {
            this.name = name;
            this.component = component;
        }

        @Override
        public Object clone() {
            return new Product(getName(), (Component)getComponent().clone());
        }
    }
}
