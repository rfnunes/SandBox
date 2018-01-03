package com.ossnms.sandbox;

/**
 * Created by pt102933 on 16-12-2014.
 */
public class Increment {

    static int value;


    public Increment(int i) {
        super();
        System.out.printf("12%1$s", "12%1$s", "12%1$s");
    }

    public static void main(String[] args) {
        //new Increment();
        new Increment(value);
        //System.out.println(value++);
    }

    public Increment() {
        while (value < 10) new Increment(++value);
        new Inc();
        new Increment().new Inc().slam();
    }

    class Inc {
        Inc() {
            System.out.println("on inc");
        }
        void slam() {}
    }

}
