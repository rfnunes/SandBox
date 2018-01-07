package com.ossnms.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import static java.lang.Thread.sleep;

class AA implements Runnable{



    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class BB extends AA {
        public void go() {
            System.out.println("BB");
        }
    }

    static class CC extends BB {
        public void go() {
            System.out.println("CC");
        }
    }

    public void go() {
        System.out.println("AA");
    }

    public static void main(String[] args) {

        final Thread thread = new Thread(new AA());
        thread.interrupt();


        AA a = new CC();
        a.go();

        List<String> l = new Vector();
        List ll = new Vector<String>();
    }


}
