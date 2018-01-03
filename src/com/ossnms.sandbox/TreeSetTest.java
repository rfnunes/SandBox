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

import java.util.Set;
import java.util.TreeSet;

class SuperTest implements Comparable<SuperTest> {

    public int compareTo(SuperTest t) {
        return getS().compareTo(t.getS());
    }

    public int x = 0;
    private String s;

    static void doThings() {
        System.out.println("Super");
    }

    SuperTest(String s) {

        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

/**
 * Created by pt102933 on 31-03-2015.
 */
public class TreeSetTest extends SuperTest {

    public int x = 1;

    TreeSetTest() {
        super("");
    }

    TreeSetTest(String s) {
        super(s);
    }

    static void doThings() {
        System.out.println("TreeSetTest");
    }

    public static void main(String[] args) {

        SuperTest s = new TreeSetTest();
        System.out.println(s.x);
        s.doThings();

        new TreeSetTest().doThings();
        System.out.println(new TreeSetTest().x);

        Set<SuperTest> ts = new TreeSet<SuperTest>();
        ts.add(new SuperTest("a"));
        ts.add(new SuperTest("a"));
        ts.add(new SuperTest("b"));

        SuperTest st = new SuperTest("c");
        SuperTest st2 = st;

        ts.add(st);
        ts.add(st2);

        System.out.println(ts.size());
    }
}
