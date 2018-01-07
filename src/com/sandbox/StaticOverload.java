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
import java.util.NavigableMap;
import java.util.TreeMap;

interface Mif {

}

class E {

}

/**
 * Created by pt102933 on 16-05-2015.
 */
public class StaticOverload {
    public static void main(String[] args) {
        boolean b = new E() instanceof Mif;

        Short.parseShort("110110", 2);

        System.out.printf("12%1$s", "13%1$s", "14%1$s");
        //System.out.println(new File("xxx.txt").isFile());

        StaticOverload so = new StaticOverload();
        so.go();


    }

    private void go() {

    }

    abstract class AAA {
        private void method() {
            System.out.println("AAA");
        }

        public boolean equals(Object o) {
            System.out.println("in equals");
            return false;
        }


        public Integer equals(AAA a) {
            System.out.println("on Equals");

            Integer[] i = new Integer[]{new Integer(1)};

            Object[] ai = "A".split("B");

            NavigableMap<String, Integer> map = new TreeMap<String, Integer>();

            final String s = map.lowerKey("");

            List<Object[]> lll = new ArrayList<Object[]>();
            lll.add(new String[]{"A"});

            synchronized ("A") {

            }

            x((byte)1);



            Long l = new Long(4);
            return l.intValue();
        }

        void x(int x) {}

        void x(short x){}



    }

}
