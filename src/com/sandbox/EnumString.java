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

/**
 * Created by pt102933 on 4/3/2016.
 */
public class EnumString {

    enum MyEnum {
        APPLES, ORANGES
    }

    EnumString(boolean x) {

    }

    public static void main(String[] args) {
    }

    private void go() {
        System.out.println(MyEnum.ORANGES.toString());

        //System.out.println(String.format(">>> %d", MyEnum.APPLES));
        System.out.println(String.format(">>> %s", MyEnum.APPLES.toString()));
        System.out.println(String.format(">>> %s", MyEnum.APPLES.name()));
    }

}
