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

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pt102933 on 24-04-2015.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Pascal");
        s.add("BASIC");
        s.add("C++");
        s.add("C#");
        s.add("C");
        s.add("C");

        for (Object s1 : s) {
            System.out.println(s1.toString()+" ");
        }

        try {
            new ExceptionTest().go();
        }
        catch(Exception e) {
            System.out.println("ex");
        }
    }

    public void go() {
        System.out.printf("45%1$+04d", 978);
    }


    private void method() throws IOException {

    }
}

class XXX extends ExceptionTest {
    public synchronized void go() {

    }
}
