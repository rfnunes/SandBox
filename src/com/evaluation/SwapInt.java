package com.evaluation;

public class SwapInt {

    public static void main(String[] args) {
        new SwapInt().go();
    }

    private void go() {
        int a = 20;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
