package com.code.course.command;

/**
 * 命令模式
 * @author tongchengyu
 */
public class CommandPatternTest {

    public interface Command {
        void execute();
    }

    public static class CommandA implements Command {

        @Override
        public void execute() {
            System.out.println("A逻辑");
        }
    }

    public static class CommandB implements Command {

        @Override
        public void execute() {
            System.out.println("B逻辑");
        }
    }

    public static class Invoker {
        private Command command;

        public Command getCommand() {
            return command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public void execute() {
            System.out.println("执行命令之前");
            command.execute();
            System.out.println("执行命令之后");
        }
    }

    public static void main(String[] args) {
        Command commandA = new CommandA();
        Command commandB = new CommandB();
        Invoker invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.execute();

        invoker.setCommand(commandB);
        invoker.execute();
    }

}
