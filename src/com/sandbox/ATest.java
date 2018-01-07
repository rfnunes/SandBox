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
 * Created by pt102933 on 12/30/2015.
 */
public class ATest {
    public static void main(String[] args) {
        new ATest().go();
    }

    private void go() {
        EnumWMain e = EnumWMain.LINK;
        System.out.println(e.getClass());
    }
}
