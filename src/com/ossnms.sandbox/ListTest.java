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
 * Created by pt102933 on 04-05-2015.
 */
public class ListTest {
    public static void main(String[] args) {
        new ListTest().go();
    }

    private void go() {
        List<Integer> list = new ArrayList<Integer>();
        cenas(list);
    }

    private void cenas(List<Integer> list) {
        list.add(0);
    }
}
