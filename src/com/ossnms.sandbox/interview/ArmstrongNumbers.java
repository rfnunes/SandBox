package com.ossnms.sandbox.interview;

import java.util.stream.IntStream;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        new ArmstrongNumbers().go();
    }

    private void go() {
        IntStream.rangeClosed(0,999)
                 .filter(this::isArmstrong)
                 .forEach(System.out::println);
    }

    private boolean isArmstrong(int i) {
        if(i < 0 || i > 999) {
            throw new IllegalArgumentException("Invalid number");
        }

        int number = i;
        double armstrong = 0;

        while(number > 0) {
            double digit = number % 10;
            number /= 10;
            armstrong += Math.pow(digit, 3);
        }

        return i == (int) armstrong;
    }
}
