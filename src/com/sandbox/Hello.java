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

import java.util.Stack;

/**
 * Created by pt102933 on 16-06-2015.
 */
public class Hello<T> {
    T t;
    public Hello(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        Stack<?> s = new Stack  ();
        if(t instanceof String) {
            System.out.println("String");
        }
        else if(t instanceof Object) {
            System.out.println(t.getClass().getName());
        }
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Hello<String>("H1"));
        System.out.println(new Hello(new String("H2")));
        System.out.println(new Hello(new StringBuilder("H3")));
    }
}
