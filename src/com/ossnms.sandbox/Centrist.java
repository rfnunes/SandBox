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

import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class Centrist {

    int inc = 0;

    void go(Integer... i) {
        inc += 1;
    }

    void go(int... i) {
        inc += 2;
    }
/*

    void go(Integer i) {
        inc += 3;
    }

    void go(int i) {
        inc += 4;
    }
*/
    static volatile int x = 0;

    public static void main(String args[]) {
        Centrist ct = new Centrist();
        //System.out.print("Value: " + ct.inc);


        //new Centrist().go(Integer.parseInt("1"));
        //new Centrist().go(1);

        System.out.println(new Formatter().format("%b", new Boolean(false)).toString());

        new Centrist.cl();

        Integer iii = new Integer(1);
        System.out.println(++iii);
    }

    final static void m() {

    }

    void go() throws Throwable {

    }

    static class cl {

    }
}
