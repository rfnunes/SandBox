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
 * Created by pt102933 on 24-05-2015.
 */
public class Threads extends Thread {
    private static Threads t1 = new Threads();
    private static Threads t2 = new Threads();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();

        t2.join();
        System.out.println("Joined T2");

        t1.interrupt();
        System.out.println("Joined T1");

    }

    @Override
    public void run() {
        try {
            go();
        } catch (InterruptedException e) {
            return;
        }
    }

    private void go() throws InterruptedException {
        synchronized (this) {
            if (Thread.currentThread().getId() == t1.getId()) {
                sleep(5000);
                System.out.println("T1 has slept");
            } else {
                for (int i = 0; i < 5; i++) {
                    sleep(200);
                    System.out.println("T2");
                }
            }
        }
    }
}
