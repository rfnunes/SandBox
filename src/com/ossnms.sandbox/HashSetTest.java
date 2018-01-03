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

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by pt102933 on 24-04-2015.
 */
public class HashSetTest {

    static final private Integer Int = 0;
    static final private int i = 0;
    public static void main(String[] args) {


        System.out.println("======================");

        TreeSet<MyObj> ts = new TreeSet<MyObj>(
                new Comparator<MyObj>() {
            @Override
            public int compare(MyObj o1, MyObj o2) {
                return o2.i-o1.i;
            }
        });

        ts.add(new MyObj(0));
        ts.add(new MyObj(1));
        ts.add(new MyObj(0));

        System.out.println(ts.size());
        for(MyObj m : ts) {
            System.out.println(m.i);
        }
    }

    private void go() throws Throwable {
        HashSet<MyObj> hs = new HashSet<MyObj>();
        hs.add(new MyObj(0));
        hs.add(new MyObj(1));
        hs.add(new MyObj(0));

        System.out.println(hs.size());
        for(MyObj m : hs) {
            System.out.println(m.i);
        }

        HashSet<Integer> hs2 = new HashSet<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>(hs2);
        HashSet<Integer> hs3 = new HashSet<Integer>(ll);

        throw new Throwable();
    }

    private static class MyObj {
        static final Integer I = 0;
        static final int ii = 0;
        int i;
        MyObj(int i) {
            this.i = i;
        }

        @Override
        public int hashCode() {


            return 31*i;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof MyObj))
                return false;
            return i==((MyObj)obj).i;
        }


    }
}
