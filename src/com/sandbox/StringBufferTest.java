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

/**
 * Created by pt102933 on 27-05-2015.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String s = "0123456789";
        StringBuffer sb = new StringBuffer(s);

        System.out.println("23".equals(s.substring(2,4)));

        System.out.println(sb.insert(4, "---").delete(4, 7));

        File f = new File("d:\\");
        System.out.println(f.exists());
        for (String fs: f.list()){
            System.out.println(fs);
        }


    }
}
