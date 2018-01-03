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
 * Created by pt102933 on 15/11/2016.
 */
public class AnnonClass {

    public static void main(String[] args) {
        MySuperClass go = new AnnonClass().go();
        System.out.println(go.sum());
    }

    private MySuperClass go() {
        return new MySuperClass(2, 3) {
            @Override
            protected int sum() {
                return a-b;
            }
        };
    }

    private class MySuperClass {
        protected final int a;
        protected final int b;

        MySuperClass(int A, int B) {

            a = A;
            b = B;
        }

        protected int sum() {
            return a+b;
        }
    }

}
