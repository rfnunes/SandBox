package com.evaluation;

public class RecursiveMultiply {

    public static void main(String[] args) {
        System.out.println(new RecursiveMultiply().multiply(5, 5));
    }

    public int multiply(int base, int times) {
        if(times == 1) {
            return base;
        }

        return base + multiply(base, times - 1);
    }
}
