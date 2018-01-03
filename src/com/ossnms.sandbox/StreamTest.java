/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 12/31/2015.
 */
public class StreamTest {
    public static void main(String[] args) {
        new StreamTest().go();
    }

    private void go() {
        Integer[] ints = {1, 2, 2};
        Stream.of(ints).filter(i -> i.equals(2)).forEach(System.out::print);

        List<MyClass> l = new ArrayList<>();

        int i = 0;
        for (; i < 10; i++) {
            MyClass mc = new MyClass();
            mc.setA(new int[]{i});
            //mc.setB(i*100);
            l.add(mc);
        }

        l.stream().flatMap(myClass -> Stream.of(myClass.getA())).forEach(System.out::println);


    }

    private class MyClass {
        int[] a;
        int b;

        public int[] getA() {
            return a;
        }

        public void setA(int[] a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}
