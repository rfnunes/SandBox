package com.ossnms.sandbox;

class Super {

    static {
        s = "";
    }

    static String s = "";

    void go() {};

    private void goX() {

    }

    private class X {
        int x = 0;
    }
}

class B extends A {
    void go() {};



    void goX() {
        Integer i = 1;
        ++i;
        System.out.println("BBB");
        System.out.printf("%2$(04d:%,d",1,2,3);
    }
}


public class A {
    public static void main(String[] args) {
        A a = new B();
        a.goX();
    }

    void goX() {
        System.out.println("AAA");
    }
}
