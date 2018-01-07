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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by pt102933 on 21/1/2017.
 */
public class RemoveHashMapValues {

    public static void main(String... a) {
        new RemoveHashMapValues().go();
    }

    public void go() {
        Map<Long, String> map = new HashMap<>();
        map.put(0L, "Hello");
        map.put(1L, null);
        map.put(2L, "World");

        System.out.println(map.toString());

        map.values().removeIf(Objects::isNull);

        System.out.println(map.toString());
    }
}
