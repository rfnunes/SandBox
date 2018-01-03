package com.ossnms.sandbox;

/**
 * Created by pt102933 on 16-12-2014.
 */
public class Fabric extends Thread {

    public static void main(String[] args) {
        Thread t = new Thread(new Fabric());
        Thread t2 = new Thread(new Fabric());
        t.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 2; i++)
            System.out.print(Thread.currentThread().getName() + " ");
    }

}
