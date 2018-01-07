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

public class Gened{

    public static void main(String argv[]){
        doNumber(2);
        doNumber(2L);
        doNumber(new int[]{1,2,3,4});
        doNumber(new Integer(2));
        doNumber(new Integer[2]);
    }

    public static void doNumber(int dn){
        System.out.print("a");
    }

    public static void doNumber(int... dn){
        System.out.print("b");
    }

    public static void doNumber(Integer dn){
        System.out.print("c");
    }


    public static void doNumber(Object dn){
        System.out.print("e");
    }

}