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

/**
 * Created by pt102933 on 15-06-2015.
 */
public class Label<T> {

    int x = go();

    enum E {C}

    public static class Inner {
        private void goInner() {
            E.C.name();
        }
    }

    private int go() {
        int[] ia = new int[5];
        new String().length();
        Inner i = new Inner();
        i.goInner();
        E.C.ordinal();
        this.x = 0;
        return 999;
    }

    public static void main(String[] args) {
        System.out.println(new Label().x);

        new Label();

        boolean flag = false;
        int x = 0;
        do {
            byte b = 1 & 2;
            System.out.println(x);
            System.out.println(flag);
            x++;
            System.out.println(x);
        } while (flag=!flag);
        System.out.println(x);
    }
}
