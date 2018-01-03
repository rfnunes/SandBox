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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pt102933 on 06-05-2015.
 */
public class InherStatic {
    enum MyEnum  {A, B}
    public static void main(String[] args) throws InterruptedException {
        MyEnum[] x = MyEnum.values();
        List<Radio> radios = new ArrayList<Radio>();
        radios.add(new Radio());
        radios.add(new Ham());
        for(Radio r : radios) {
            System.out.println(r.getFreq() + " " + r.getF());
        }
        ArrayList[] arrayLists = new ArrayList[3];
        Object o = arrayLists;
        do1(new Ham());
        Thread.currentThread().join();
    }

    static void do1(Radio ham) {

    }

}

class Radio {
    String getFreq() { return "Radio"; }
    static String getF() {return "radio"; }
}

class Ham extends Radio {
    String getFreq() { return "Ham"; }
    static String getF() {return "ham"; }
}