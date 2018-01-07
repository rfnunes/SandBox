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
 * Created by pt102933 on 24-05-2015.
 */
public class PrivateTest {
    private void mm() {
        System.out.println("Private");
    }

    public static void main(String[] args) {
        PrivateTest pt = new Private();
        pt.mm();

        Private p = new Private();
        p.mm();
    }
}

class Private extends PrivateTest {
    protected void mm() {
        System.out.println("Protected");
    }
}
