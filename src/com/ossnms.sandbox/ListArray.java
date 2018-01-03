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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by pt102933 on 28-06-2015.
 */
public class ListArray {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("ONE");
        final String[] objects = list.toArray(new String[list.size()+1]);
        objects[list.size()] = "TWO";

        list.add("BLAH");


        for (String s : list) {
            System.out.println(s);
        }

        for (String object : objects) {
            System.out.println(object);
        }

        System.out.println("===================");

        String[] strings = new String[]{"ONE", null};
        List<String> ls = Arrays.asList(strings);

        strings[1]  = "TWO";
        strings[0] = "BLAH";
        //ls.add("THREE");

        ls.set(0, "ONE");

        for (String string : strings) {
            System.out.println(string);
        }

        for (String l : ls) {
            System.out.println(l);
        }

        List<String> c = new ArrayList<String>();
        c.add("five");
        c.add("six");
        c.add("seven");
        c.add("eigth");
        System.out.println(Collections.binarySearch(c, "six"));

        List<Integer> li = new ArrayList<Integer>();
        for (int integer : li) {

        }

        File f = new File("");
        f.mkdir();
        f.renameTo(new File(""));
        f.createNewFile();


    }
}
