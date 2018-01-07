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
 * Created by pt102933 on 01-02-2015.
 */
public class Format {

    public static void main(String[] args) {
        System.out.println(String.format(">%d<",-123));

        System.out.println(String.format(">%(d<", -123));
        System.out.println(String.format(">%+-7d<",-123));
        System.out.println(String.format(">%(-9d<", -123));
        System.out.println(String.format(">%(+-9d<", 123));
    }
}
