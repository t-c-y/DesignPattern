package com.code.course.builder;


/**
 * 优化后的构造器模式
 * @author tongchengyu
 */
public class OptimizedBuilderPatternTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Builder builder = new CreateBuilder();
        Product product =
                builder.setF1("field1")
                        .setF3("field3")
                        .setF2("field2")
                        .create();
        System.out.println("product = " + product);
    }

    /**
     * 创建
     */
    public static class CreateBuilder implements Builder {

        private Product product = new Product();

        @Override
        public Builder setF1(String f1) {
            product.setField1(f1);
            return this;
        }

        @Override
        public Builder setF2(String f2) {
            product.setField2(f2);
            return this;
        }

        @Override
        public Builder setF3(String f3) {
            product.setField3(f3);
            return this;
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
        Builder setF1(String f1);
        Builder setF2(String f2);
        Builder setF3(String f3);
        Product create();
    }

    /**
     * 产品
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
