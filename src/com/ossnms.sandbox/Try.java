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
 * Created by pt102933 on 27-06-2015.
 */
enum En {
    ONE() {
        void go(int i) {
            x = i;
        }
    };

    void go(int i) {
        x = 999;
    }

    int x;

    @Override
    public String toString() {
        return "["+x+"]";
    }
}

public class Try {
    public static void main(String[] args) {
        En.ONE.go(1);
        En.ONE.go(2);
        En.ONE.go(3);
        System.out.println(En.ONE);
    }
}
