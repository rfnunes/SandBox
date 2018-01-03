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

/**
 * Created by pt102933 on 6/6/2016.
 */
public class VlanSetTest {

    List<Integer> notEmptyList = new ArrayList<>(2);
    List<Integer> emptyList = new ArrayList<>(0);

    public static void main(String[] args) {
        new VlanSetTest().go();
    }

    private void go() {

        notEmptyList.add(0);
        notEmptyList.add(1);

        System.out.println(old(emptyList, 0));
        System.out.println(newX(emptyList, 0));

        /*
        System.out.println(old(null, 0) == newX(null, 0));

        System.out.println(old(emptyList, 0) == newX(emptyList, 0));

        System.out.println(old(notEmptyList, 0) == newX(notEmptyList, 0));

        System.out.println(old(notEmptyList, 10) == newX(notEmptyList, 10));
        */
    }

    private static boolean old(List<Integer> list, int value) {
        return list != null && !list.isEmpty() && !list.contains(value);
    }

    private static boolean newX(List<Integer> list, int value) {
        return list != null && !list.contains(value);
    }

}
