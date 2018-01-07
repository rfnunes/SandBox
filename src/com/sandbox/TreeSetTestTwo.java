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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pt102933 on 17-06-2015.
 */
public class TreeSetTestTwo {

    public static void main(String... args) {
        Set<AClass> set = new TreeSet<AClass>();
        set.add(new AClass(1));
        set.add(new AClass(1));
        System.out.println(set.size());

        List<Integer> l = Arrays.<Integer>asList(1,2,3,4);

        Map<String, String> map = new HashMap<String, String>();
        Set s = map.keySet();
        s = new TreeSet(s);

    }
}

class AClass implements Comparable<AClass> {

    private int n;

    AClass(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(AClass o) {
        return n - o.n;
        //return 1;
    }

/*
    @Override
    public int hashCode() {
        return 31*n;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof AClass)) {
            return false;
        }

        AClass a = (AClass) obj;
        return n == a.n;
    }
*/
}
