package com.ossnms.sandbox;

/**
 * Created by pt102933 on 27/4/2017.
 */
public interface MyInterfaceTwo {

    default void doThings() {
        System.out.println("MyInterfaceTwo");
    }
}
