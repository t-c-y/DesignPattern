package com.code.course.adapter;

/**
 * @author tcy
 */
public class AdapterPatterTest {
    /**
     * 适配器模式
     * 何时使用：
     * 1、系统需要使用现有的类，而此类的接口不符合系统的需要。
     * 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，
     * 包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
     * 3、通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，
     * 在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
     *
     * 优点：
     * 1、可以让任何两个没有关联的类一起运行。
     * 2、提高了类的复用。
     * 3、增加了类的透明度。
     * 4、灵活性好。
     * 缺点：
     * 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。
     * 比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，
     * 一个系统如果太多出现这种情况，无异于一场灾难。
     * 因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
     * 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
     *
     */

    public static void main(String[] args) {
        // 不使用设计模式的调用方式
        withOutPatter();
        System.out.println("==============================");
        // 使用适配设计模式的调用
        usePatter();
    }

    private static void usePatter() {
        NewInterface oldInterface = new AdapterInterface(new OldInterfaceImpl());
        NewInterface newInterface = new NewInstanceImpl();
        oldInterface.newMethod();
        newInterface.newMethod();
    }

    /**
     * 适配器模式，把旧接口用适配器封装
     */
    public static class AdapterInterface implements NewInterface {

        private OldInterface oldInterface;

        public AdapterInterface(OldInterface oldInterface) {
            this.oldInterface = oldInterface;
        }

        @Override
        public void newMethod() {
            oldInterface.oldMethod();
        }
    }

    /**
     * 不使用设计模式，定义时需要区分新旧接口
     */
    private static void withOutPatter() {
        OldInterface oldInterface = new OldInterfaceImpl();
        oldInterface.oldMethod();
        NewInterface newInterface = new NewInstanceImpl();
        newInterface.newMethod();
    }

    public interface OldInterface {
        void oldMethod();
    }

    public static class OldInterfaceImpl implements OldInterface {
        @Override
        public void oldMethod() {
            System.out.println("旧版接口调用成功！！！");
        }
    }

    public interface NewInterface {
        void newMethod();
    }

    public static class NewInstanceImpl implements NewInterface {
        @Override
        public void newMethod() {
            System.out.println("新版接口调用成功！！！");
        }
    }

}
