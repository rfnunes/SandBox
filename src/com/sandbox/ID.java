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
 * Created by pt102933 on 07-06-2015.
 */
public class ID
{
    public static void main(String... args)
    {
        Object [] object = new String[5][5];
        int counter=0;
        for (Object o : object )
        {
            counter++;
        }
        System.out.println(counter);
    }
}