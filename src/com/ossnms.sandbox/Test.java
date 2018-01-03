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
 * Created by pt102933 on 18-05-2015.
 */
public class Test {
    private Integer value = 1;

    public Integer getValue() {
        return value;
    }

    public void changeVal(Integer value) {
        value = new Integer(3);
    }

    public static void main(String args[]) {
        Integer a = new Integer(2);
        Test c = new Test();
        c.changeVal(a);
        System.out.print(a);

        Integer i1 = new Integer(1);
        i1 = new Integer(3);

        System.out.println(i1);
    }
}