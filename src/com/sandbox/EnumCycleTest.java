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

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by pt102933 on 8/2/2017.
 */
public class EnumCycleTest {

    enum MyEnum { A, B, C }

    private static final Set<MyEnum> set = EnumSet.allOf(MyEnum.class);

    public static void main(String[] args) {
        new EnumCycleTest().go();
    }

    private void go() {
        long tStart = System.currentTimeMillis();
        check(MyEnum.C);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        //double elapsedSeconds = tDelta / 1000.0;
        System.out.println(tDelta);
    }

    private boolean check(MyEnum c) {
        //return set.contains(c);
        return c == MyEnum.A || c == MyEnum.B || c == MyEnum.C;
    }
}
