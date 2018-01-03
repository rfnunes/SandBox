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

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by pt102933 on 26-04-2015.
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        String[] towns = {"aspen", "vail", "t-ride", "dillon"};
        BinarySearchTest b = new BinarySearchTest();
        MySort ms = new MySort();
        //Arrays.sort(towns, ms);
        System.out.println(Arrays.binarySearch(towns, "vail", ms));

        Integer i = new Integer(42);
        for(int j = 0; j < i; i--) {
            System.out.println(i);
        }
        StringBuffer s;


    }

    private static class MySort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
