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
 * Created by pt102933 on 31-05-2015.
 */
public final class Statics  {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>(2);
        System.out.println(l.size());
        l.clear();
        System.out.println(l.size());
        l.add(1, 1);

        int iii = (int) 4L;

        System.out.println(StaticIf.MYCONST);

        switch(TZ.A) {
            case A:
            case B:
                
        }

        Short s = Short.valueOf("1");

        Statics superStatic = new Statics();
    }
}

enum TZ {A,B};

class SuperStatic {
    public static final int MYCONST = 5;
    public void go() {
        System.out.println(SuperStatic.class.getName());
    }
}

interface StaticIf {
    int MYCONST = 5;
    void go();
}