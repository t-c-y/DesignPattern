package com.code.course.template;

/**
 * @author tcy
 */
public class TemplateMethodPatterTest {

    /**
     *
     * 模版方法模式
     * 比如说，不同的折扣类型，不同的优惠券类型，不同的商品类型，那肯定涉及到不同的处理逻辑。
     * 但是可以将他们共同的基础逻辑抽取到父类中，然后将要子类实现的逻辑留空，交给子类去实现。
     *
     */

    public interface DiscountCalculator {
        void calculate();
    }

    public static abstract class AbstractCalculator
            implements DiscountCalculator {

        @Override
        public void calculate() {
            common();
            personal();
        }

        public void common() {
            System.out.println("通用逻辑");
        }

        public abstract void personal();
    }

    public static class DiscountCalculator1 extends AbstractCalculator {

        @Override
        public void personal() {
            System.out.println("个性化1");
        }
    }

    public static class DiscountCalculator2 extends AbstractCalculator {

        @Override
        public void personal() {
            System.out.println("个性化2");
        }
    }

    public static class DiscountCalculator3 extends AbstractCalculator {

        @Override
        public void personal() {
            System.out.println("个性化3");
        }
    }

    public static void main(String[] args) {
        DiscountCalculator discountCalculator1 = new DiscountCalculator1();
        discountCalculator1.calculate();

        DiscountCalculator discountCalculator2 = new DiscountCalculator2();
        discountCalculator2.calculate();

        DiscountCalculator discountCalculator3 = new DiscountCalculator3();
        discountCalculator3.calculate();
    }

}
