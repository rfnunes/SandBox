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

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * Created by pt102933 on 07-06-2015.
 */
public class navi {
    private void navi()
    {

    }

    private void manny()
    {
        NavigableMap< String, String> map = new TreeMap<String, String>();
        map.put("a", "b");
        map.put("b", "a");
        NavigableSet<String> descendingKeySet = map.descendingKeySet();
        for(String x : descendingKeySet)
        {
            System.out.println(x);
        }
    }
}
