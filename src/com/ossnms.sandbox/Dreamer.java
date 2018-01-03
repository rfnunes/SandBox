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
 * Created by pt102933 on 07-06-2015.
 */
public class Dreamer  {
    public static void main(String... args)
    {
        System.out.println(PinSize.BIG == PinSize.BIGGER); // #1
        System.out.println(PinSize.BIG.equals(PinSize.BIGGER));// #2
        //System.out.println(PinSize.BIG > PinSize.BIGGERER);// #3
        System.out.println(PinSize.BIG.toString().equals(PinSize.BIGGER));// #4
        PinSize b = PinSize.BIG ;
        System.out.println( b instanceof Comparable);// #5
        System.out.println(b.compareTo(PinSize.BIGGERER));
    }
}
enum PinSize { BIG, BIGGER, BIGGERER };