package com.evaluation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MissingNumber {

    public static final int MAX = 100;

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        scanner.close();

        missingNumber.go(n);
    }

    public int go(int n) {

        if(n > MAX) {
            throw new IllegalArgumentException("Max exceeded");
        }

        int[] ints = IntStream.rangeClosed(1, MAX)
                              .toArray();

        ints[n-1] = 0;

        int count = 0;
        for(int i = 1; i <= 100; i++) {
            count += i;
        }

        int res = 0;
        for (int i = 0; i < ints.length; i++) {
            res += ints[i];
        }

        return count - res;
    }
}
