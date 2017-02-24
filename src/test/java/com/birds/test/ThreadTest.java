package com.birds.test;

public class ThreadTest {

    private final static ThreadLocal<Context> dataBox = new ThreadLocal<Context>();

    public static void main(String[] args) {
        Context context = dataBox.get();
        if (context == null) {
            context = new Context();
            System.out.println(context);
            dataBox.set(context);
        }
        context.getClass();
        System.out.println(dataBox.get());
    }
}

class Context {

}
