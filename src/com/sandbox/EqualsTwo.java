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

import java.util.IntSummaryStatistics;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 15-06-2015.
 */
public class EqualsTwo {

    EqualsTwo() {
        try {
        }
        catch (RuntimeException e) {
            float x = 99;
        }
    }

    void go(float f) {

    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

    static String getInt() {

        MyAClass x = null;

        return Stream.of(x).filter(Objects::nonNull).findFirst().map(Objects::toString).orElse("");

    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("On Object equals");
        return super.equals(obj);
    }

    public boolean equals(EqualsTwo obj) {
        int i;
        int j;
        System.out.println("On Custom equals");
        return true;
    }

    private static class MyAClass {
        private Integer i;

        public Integer getI() {
            return i;
        }

        public void setI(Integer i) {
            this.i = i;
        }
    }

}
