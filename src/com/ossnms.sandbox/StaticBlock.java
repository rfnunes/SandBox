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

import java.lang.Integer;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pt102933 on 27-06-2015.
 */
public class StaticBlock  {

    public int compareTo(Object o) {
        return 0;
    }

    static class C implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    static SuperClassA a = new SuperClassA();
    static AClassA c = new AClassA(1);
    static Object o = new AClassA(1);

    public static void main(String[] args) {
////        String s = new String("") + new char[]{'x'}[1];
//        String s1 = new String(new char[]{'0'});
//
//        System.out.println(c instanceof SuperClassA);
//        System.out.println(c instanceof SubClassA);
//        System.out.println(o instanceof AClassA);
//        System.out.println(o instanceof Object);
//        System.out.println(o instanceof Number);
//
//
//        Integer i = 1;
//        Long l = (long) 1;
//        Float f = (float) 1;
//        Double d = (double) 1;
//
          TreeSet<Integer> s = new TreeSet<Integer>();
          s.add(1);
          s.add(9);

        NavigableSet<Integer> ns = (NavigableSet<Integer>) s.subSet(1, 10);

        ns.add(10);

        for(Integer is : ns) {
            System.out.println(is);
        }

        System.gc();
        Runtime.getRuntime().gc();

        Calendar.getInstance();
        DateFormat.getInstance();
        DateFormat.getTimeInstance().format("");
    }


}

class SuperClassA {

    private void m() {

    }

    public SuperClassA() {

    }

    protected void go() {

    }
}

abstract class SubClassA extends SuperClassA {

    private void m() {

    }

    private SubClassA() {
        super();
        SuperClassA a = new SuperClassA();
    }

    protected SubClassA(int i) {
        this();
    }

}

final class AClassA extends SubClassA {

    AClassA(int i) {
        super(i);
    }
}


