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
public class Trans extends Thread
{
    static int var;
    public static void main(String args[]) throws Exception
    {
        Trans f = new Trans();
        Thread t = new Thread(f);
        Thread t2 = new Thread(new Trans());
        t.start();
        t2.start();
    }

    public void run()
    {
        gun();
    }

    public void gun()
    {
        int counter=0;
        for (counter = var ; counter < var+3 ; counter++)
        {
            System.out.print(counter + " ");
        }
    }
}
