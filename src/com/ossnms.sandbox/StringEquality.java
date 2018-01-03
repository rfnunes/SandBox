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

import java.io.Console;
import java.text.DateFormat;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pt102933 on 26-04-2015.
 */
public class StringEquality {
    public static void main(String[] args) {
        String s1 = "x";
        System.out.println(s1 == "x");
        System.out.println(s1.equals("x"));

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder("y");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(new StringBuilder(s1)));

        Set<Integer> mySet = new TreeSet<Integer>();
        mySet.add(1); mySet.add(2); mySet.add(new Integer(3));

        Iterator i = mySet.iterator();
        for (Integer inti : mySet) {
            System.out.println(inti);
        }

        String x = "a.b";
        String[] tokesn = x.split("\\s");
        for(String o : tokesn) {
            System.out.println(o);
        }
    }
}

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        Console c = System.console();
        char[] pw = c.readPassword();
        DateFormat df = DateFormat.getDateInstance();
        return 0;
    }
}


