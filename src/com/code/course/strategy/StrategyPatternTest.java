package com.code.course.strategy;

/**
 * 策略模式
 * @author tongchengyu
 */
public class StrategyPatternTest {

    public interface Strategy {
        public void calculate();
    }

    public static class DefaultStrategy implements Strategy {

        @Override
        public void calculate() {
            System.out.println("默认策略的逻辑");
        }
    }

    public static class StrategyOne implements Strategy {

        @Override
        public void calculate() {
            System.out.println("策略1的逻辑");
        }
    }

    public static class StrategyTwo implements Strategy {

        @Override
        public void calculate() {
            System.out.println("策略2的逻辑");
        }
    }

    public static class StrategyThree implements Strategy {

        @Override
        public void calculate() {
            System.out.println("策略3的逻辑");
        }
    }

    public static class StrategyFactory {
        public static Strategy getStrategy(int type) {
            if (type == 1) {
                return new StrategyOne();
            } else if (type == 2) {
                return new StrategyTwo();
            } else if (type == 3) {
                return new StrategyThree();
            }
            return new DefaultStrategy();
        }
    }

    public static class Context  {
        public Strategy strategy;

        public Strategy getStrategy() {
            return strategy;
        }

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }

        public void calculate() {
            strategy.calculate();
        }
    }

    public static void main(String[] args) {
        int type = 4;
        Strategy strategy = StrategyFactory.getStrategy(type);
        Context context = new Context();
        context.setStrategy(strategy);
        context.calculate();
    }

}
