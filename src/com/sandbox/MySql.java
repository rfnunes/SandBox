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
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Created by pt102933 on 13/10/2016.
 */
public class MySql {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(null);

        System.out.println(list.stream().map(i -> i).allMatch(i -> i > 2));
    }
}
