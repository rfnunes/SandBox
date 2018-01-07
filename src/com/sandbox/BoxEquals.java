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

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by pt102933 on 14-02-2015.
 */
public class BoxEquals {

    public static void main(String... args) {
        Integer i1 = 1000;
        Integer i2 = 1000;

        Integer i3 = new Integer(127);
        Integer i4 = new Integer(127);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        Integer i5 = new Integer(0);
        int x = 0;

        System.out.println(i5 == x);
        go(x);

        NavigableSet<String> nm = new TreeSet<String>();
        nm.add("J");
        nm.add("A");
        nm.add("V");
        nm.add("A");
        NavigableSet<String> ns = nm.subSet("A", true, "K", true);
        System.out.println(ns.size());
        ns.add("B");
        ns.add("K");
        System.out.println(ns.size());
        System.out.println(nm.size());
    }

    static void go(byte x) {
        System.out.println("primitive long");
    }

    static void go(Object x) {
        System.out.println("Boxed Integer");
    }
}
