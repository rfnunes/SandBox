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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pt102933 on 31-01-2015.
 */
public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        System.out.println("Pattern is "+m.pattern());
        while (m.find()) {
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
    }
}
