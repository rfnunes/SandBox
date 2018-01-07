package com.ossnms.sandbox;

import java.util.*;
import java.util.Scanner;

/**
 * Created by pt102933 on 12-01-2015.
 */
public class EnumTest {

    enum MyEnum { ONE(1), TWO();

        MyEnum(int i) {

        }

        MyEnum() {

        }

        private int x;
    }

    public static void main(String[] args) {
/*
        MyEnum e = null;
        short x = 7;
        System.out.println(MyEnum.ONE.x);
        System.out.println((MyEnum.ONE.equals(e)));

        for(MyEnum2 i : MyEnum2.values()) {
            System.out.println(i.getValue());
        }
*/

    }

    static int go(short x) {
        try {
            return 1;
        }finally {
            return 0;
        }
    }
}

enum MyEnum2 {
    AAA(), BBB(1), CCC();
    int i=999;
    MyEnum2() {

    }
    MyEnum2(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}
