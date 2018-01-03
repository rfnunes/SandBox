package com.ossnms.sandbox;

/**
 * Created by pt102933 on 19-12-2014.
 */
public class SubClass extends SuperClass{
    public static void printMe() throws ArithmeticException {
        System.out.println("sub");
    }
    public static void main(String argv[]) {
        SuperClass sc = new SubClass();
        sc.printMe();
    }
}

class SuperClass {
    static void printMe() {
        System.out.println("super");
    }
}

interface OtherIF {

}

abstract interface MyInterface extends OtherIF {
static int x = 0;
}
