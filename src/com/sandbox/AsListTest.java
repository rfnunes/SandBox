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
import java.util.List;

/**
 * Created by pt102933 on 21-05-2015.
 */
public class AsListTest {
    public static void main(String[] args) {
        new AsListTest().go(1, 2, 3, 5, 7);
    }

    private void go(Integer... ints) {
        List<Integer> i = new ArrayList<Integer>(Arrays.asList(ints));
        ints[0] = 99;
        i.add(71);
        for(int k = i.size(); k > 0; k--) {
            i.remove(i.size()-1);
        }

        System.out.println(">"+i.size()+"<");

        Integer[] ia = {1,2,3,4,5};
        List<Integer> ll = new ArrayList<Integer>();
        ll = Arrays.asList(ia);
        ia[0] = 99;
    }
}
