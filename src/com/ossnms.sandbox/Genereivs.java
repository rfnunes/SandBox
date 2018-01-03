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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pt102933 on 30-05-2015.
 */
public class Genereivs extends Super {

    static final int x = 0;

    public static void main(String[] args) {
        String s = "";
        String s1 = "";

        String[] sss = new String[1];
        Object o = new int[4];
        Object[] oa = sss;
        Object oas = new Integer[4];


        System.out.println(s==s1);

        List<Object> l = new ArrayList<Object>();
        int x = 990;
        go(x);

    }

    static void go(int x) {
        System.out.println(x);
    }

    private static <K,V> void go2(Map<K,V> ll) {

        for (Map.Entry<K, V> kvEntry : ll.entrySet()) {
            System.out.println(kvEntry);
        }

    }

    private static void go(List<? super SuperA> l) {
        l.add(new SuperA());
    }

    private static void goo(Number e) {
        System.out.println("Number");
    }


    private static void goo(String i) {
        System.out.println("Integer");
    }

}


class SuperA extends SuperS {
    public String name;
}

class SuperS {
    public String name;
}

class MC<K, V extends List<E>> extends HashMap<K, V> {

}
