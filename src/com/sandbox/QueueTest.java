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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueTest {

    List<Integer> numbers = new CopyOnWriteArrayList<>();

    Integer sum = 0;

    TransferQueue<Integer> transferQueue = new LinkedTransferQueue<>();

    Thread[] threads = new Thread[100];

    interface IMyType {
        void doThings();
    }

    public static void main(String[] args) throws InterruptedException {
        new QueueTest().go();
    }

    private void go() throws InterruptedException {

        IMyType o = (IMyType) Proxy.newProxyInstance(QueueTest.class.getClassLoader(), new Class[]{IMyType.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Invoked: " + method.getName());
                return null;
            }
        });

        o.doThings();

        ConsumerThread consumerThread = new ConsumerThread();
        consumerThread.start();

        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> transferQueue.offer(1));
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        consumerThread.interrupt();

        /*
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter something : ");
                String input = br.readLine();

                if ("q".equals(input)) {
                    consumerThread.interrupt();
                    System.out.println("Exit!");

                    System.out.println(sum);

                    System.exit(0);
                }

                transferQueue.offer(Integer.valueOf(input));

                System.out.println("input : " + input);
                System.out.println("-----------\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    private class ConsumerThread extends Thread {

        @Override
        public void run() {
            try {
                Integer newNumber;
                while ((newNumber = transferQueue.take()) != null) {
                    numbers.add(newNumber);
                    sum = numbers.stream().mapToInt(Integer::intValue).sum();
                }
            }
            catch (InterruptedException e) {
                while(!transferQueue.isEmpty()) {
                    continue;
                }
                System.out.println(sum);
                System.out.println("Terminating.");
            }
        }
    }
}
