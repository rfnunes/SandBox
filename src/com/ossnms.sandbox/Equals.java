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
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by pt102933 on 16-05-2015.
 */
class FF {

}

class EE {
    private Boolean equals(EE e) {
        System.out.println("In equals");
        return true;
    }

    abstract private class DD {

    }
}

public class Equals {

    public static void main(String[] args) {

        byte b = (byte) Integer.valueOf(1).intValue();
        int i = (int)1l;
        int x = (int)1f;
        char c = (short) 1;
        short s = (byte) 1;
        byte bb = (short) 0;
        short ss = new Short((short)1);
        char cc = (byte) 1;
        byte bbb = new Byte("0");

        new R().run();

        NavigableMap<String, Integer> navmap = new TreeMap<String, Integer>();
        navmap.put("one", 1);
        navmap.put("two", 2);
        navmap.put("three", 3);
        navmap.put("four", 4);
        navmap.put("five", 5);

        mmm(new Integer [2]);

        List<String> sas = new ArrayList();
        List sus = new ArrayList<String>();

        sas.add("");
        sus.add("");

    }


    static void mmm(Integer... xx) {

    }


}

abstract class S {
    protected String s = "S";
    abstract void run();
}

class R extends S {

    private String s = "R";

    @Override
    void run() {
        System.out.println(super.s);
        System.out.println(s);
    }
}