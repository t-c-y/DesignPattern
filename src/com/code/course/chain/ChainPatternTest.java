package com.code.course.chain;

/**
 * 责任链模式
 * @author tongchengyu
 */
public class ChainPatternTest {

    public static abstract class Handler {

        protected Handler successor;

        public Handler (Handler successor) {
            this.successor = successor;
        }

        protected abstract void execute();
    }

    public static class Handler1 extends Handler {

        public Handler1(Handler successor) {
            super(successor);
        }

        @Override
        protected void execute() {
            System.out.println("功能1");
            if (successor != null) {
                successor.execute();
            }
        }
    }

    public static class Handler2 extends Handler {

        public Handler2(Handler successor) {
            super(successor);
        }

        @Override
        protected void execute() {
            System.out.println("功能2");
            if (successor != null) {
                successor.execute();
            }
        }
    }

    public static class Handler3 extends Handler {

        public Handler3(Handler successor) {
            super(successor);
        }

        @Override
        protected void execute() {
            System.out.println("功能3");
            if (successor != null) {
                successor.execute();
            }
        }
    }

    public static void main(String[] args) {
        Handler handler3 = new Handler3(null);
        Handler handler2 = new Handler2(handler3);
        Handler handler1 = new Handler1(handler2);
        handler1.execute();

        handler2 = new Handler2(null);
        handler3 = new Handler3(handler2);
        handler1 = new Handler1(handler3);
        handler1.execute();

        // 责任链的思想
        // 1：将一个业务流程中的多个步骤拆分开来，每个步骤封装到一个handler处理器中去
        // 2：支持业务流程基于handler动态组装，不同的业务流程 -> handler代表的代码组件可以复用

        // 好处1：将这个代码封装到一个handler中，后面如果要对某个步骤的代码逻辑调整，修改一个handler即可
        // 好处2：如果业务流程要修改，那么不需要拷贝大量的代码，只要基于handler动态组装业务流程即可

        // 面向的场景
        // 就是有多个业务流程，这些业务流程之间有相同的代码逻辑和步骤
        // 可以用责任链模式来实现
    }

}
