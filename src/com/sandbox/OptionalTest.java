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

import java.util.Optional;

/**
 * Created by pt102933 on 11/23/2015.
 */
public class OptionalTest {

    public static void main(String[] args) {
        new OptionalTest().go();
    }

    private void go() {
        System.out.println(getName());

    }

    private String getName() {

        /*
        Boolean t = false;

        if(Optional.ofNullable(t).orElse(Boolean.FALSE)) {
            System.out.println("Entered!");
        }

        String str = "Hello World!";

        str = null;

        Optional<String> o = Optional.ofNullable(str);
        return o.orElse("N/A");
        */

        MyClass m = new MyClass(999);

        String u = Optional.ofNullable(m.i).map(String::valueOf).orElse("N/A");

        return u;
    }

    private class MyClass {
        Integer i = null;

        MyClass(Integer i) {
            this.i = i;
        }
    }
}
