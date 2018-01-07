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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by pt102933 on 12/28/2015.
 */
public class NestedLists {

    public static void main(String[] args) {
        new NestedLists().go();
    }

    private void go() {
        Set<Integer> ids = new HashSet<>();

        final MyObj[] ints =
                new MyObj[]{new MyObj(1), new MyObj(3), new MyObj(5)};

        List<MyObj> listOne = new ArrayList<>(Arrays.asList(ints));


    }

    private class MyObj {
        List<Integer> list;
        public MyObj(int i) {
            list = new ArrayList<>();
            list.add(i);
            list.add(i+1);
        }

        public List<Integer> getList() {
            return list;
        }
    }
}
