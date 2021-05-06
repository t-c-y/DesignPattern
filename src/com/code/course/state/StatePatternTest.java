package com.code.course.state;

/**
 * 状态模式
 * @author tongchengyu
 */
public class StatePatternTest {
    public interface State {
        void execute();
    }

    public static class CreateState implements State {

        @Override
        public void execute() {
            System.out.println("创建状态");
        }
    }

    public static class ApprovingState implements State {

        @Override
        public void execute() {
            System.out.println("审核中状态");
        }
    }

    public static class ApprovedState implements State {

        @Override
        public void execute() {
            System.out.println("审核通过状态");
        }
    }

    public static class FinishedState implements State {

        @Override
        public void execute() {
            System.out.println("完成状态");
        }

    }

    public static class Context {
        private State state;
        public Context(State state) {
            this.state = state;
            this.state.execute();
        }

        public void execute(int type) {
            if(type == 1) {
                this.state = new ApprovingState();
                this.state.execute();
            } else if(type == 2) {
                this.state = new ApprovedState();
                this.state.execute();
            } else if(type == 3) {
                this.state = new FinishedState();
                this.state.execute();
            }
        }
    }

    public static void main(String[] args) {
        Context context = new Context(new CreateState());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }
}
