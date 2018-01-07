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
 * Created by pt102933 on 22-06-2015.
 */
public class TesterOne extends Thread {
    public static void main(String[] args) {
        int i1 = 120;
        int i2 = 1200;


        Integer in1 = Integer.valueOf(i2);
        Integer in2 = Integer.valueOf(i2);
        System.out.println(in2 == 0);

        System.out.println(in1 == in2);

        in1 = Integer.valueOf(i1);
        in2 = Integer.valueOf(i1);
        System.out.println(in1 == in2);

        in1 = new Integer(i1);
        in2 = new Integer(i1);
        System.out.println(in1 == in2);

        in1 = Integer.valueOf(i1);
        in2 = Integer.valueOf(i1);
        System.out.println(in1==in2);
    }

    @Override
    public void run() {
        StringBuffer sb = new StringBuffer("javachamp");

        String s = new String("javachamp");
        boolean stmt1 = s.equals(sb) ;

        boolean stmt2 = sb.equals(s) ;

        boolean stmt3 = sb.toString() == s ;

        boolean stmt4 = sb.toString().equals(s) ;

        boolean stmt5 = s.equals(sb.toString()) ;

        String stmt = null;
        System.out.print(null+stmt);
        System.out.print(stmt+null);
        if (true)
            throw new NullPointerException();
        System.out.print("doC");
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
