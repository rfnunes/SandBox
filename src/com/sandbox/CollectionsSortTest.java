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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pt102933 on 02-06-2015.
 */
public class CollectionsSortTest {
    public static void main(String[] args) {
        Runtime.getRuntime().gc();
        System.gc();
        System.getProperties();
        List list = new LinkedList<String>();
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("Z");

        for (String s : l) {
            System.out.println(s);
        }

        Collections.sort(l);

        for (String s : l) {
            System.out.println(s);
        }

        int[] a = new int[2];
        int[] aa = new int[3];

        a = aa;

        System.out.println(">>>>>>>>> "+a.length+ ", "+aa.length);

        List<MyClass> lmc = new ArrayList<MyClass>();
        lmc.add(new MyClass("a"));
        lmc.add(new MyClass("Z"));

        for (MyClass myClass : lmc) {
            System.out.println(myClass);
        }

        Collections.sort(lmc);

        for (MyClass myClass : lmc) {
            System.out.println(myClass);
        }

        Comparator<MyClass> comparator = Collections.reverseOrder();
        Collections.sort(lmc, comparator);

        for (MyClass myClass : lmc) {
            System.out.println(myClass);
        }

        StringBuilder[] mca = new StringBuilder[]{new StringBuilder(), new StringBuilder()};
        Arrays.sort(mca);

    }

    private static class MyClass implements Comparable{
        String s;
        MyClass(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return s;
        }

        public String getS() {
            return s;
        }

        @Override
        public int compareTo(Object o) {
            return s.compareTo(((MyClass)o).getS());
        }
    }
}
