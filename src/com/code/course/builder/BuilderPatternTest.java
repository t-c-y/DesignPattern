package com.code.course.builder;



/**
 * 构造器模式
 * @author tongchengyu
 */
public class BuilderPatternTest {
    /**
     * 创建复杂对象
     */

    public static void main(String[] args) {
        Director director = new Director(new CreateBuilder());
        Product product = director.build("field1", "field2", "field3");
        System.out.println("product = " + product);
    }

    public static class Director {

        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        public Product build(String f1, String f2, String f3) {
            builder.setF1(f1);
            builder.setF2(f2);
            builder.setF3(f3);
            return builder.create();
        }

    }

    /**
     * 创建
     */
    public static class CreateBuilder implements Builder {

        private Product product = new Product();

        @Override
        public void setF1(String f1) {
            product.setField1(f1);
        }

        @Override
        public void setF2(String f2) {
            product.setField2(f2);
        }

        @Override
        public void setF3(String f3) {
            product.setField3(f3);
        }

        @Override
        public Product create() {
            return product;
        }
    }

    /**
     * 构造器接口
     */
    public interface Builder {
        void setF1(String f1);
        void setF2(String f2);
        void setF3(String f3);
        Product create();
    }

    /**
     * 产品类
     */
    public static class Product {
        private String field1;
        private String field2;
        private String field3;

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }

        public String getField3() {
            return field3;
        }

        public void setField3(String field3) {
            this.field3 = field3;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "field1='" + field1 + '\'' +
                    ", field2='" + field2 + '\'' +
                    ", field3='" + field3 + '\'' +
                    '}';
        }
    }
}
