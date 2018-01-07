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
import java.text.NumberFormat;

public class Gazillion {

    public static void main(String[] args) throws Exception {
        String s = "1xyz";
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse(s));
        nf.setMaximumFractionDigits(2);
//        System.out.println(nf.format(s));

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);

    }
}