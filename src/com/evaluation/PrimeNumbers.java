package com.evaluation;

import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                 .filter(PrimeNumbers::isPrime)
                 .forEach(System.out::println);
    }

    private static boolean isPrime(int n) {
        return IntStream.range(2, n).noneMatch(i -> n % i == 0);
    }
}
