package com.ossnms.sandbox.interview;

import static java.util.stream.Collectors.toList;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

    private static final Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 1000)
                 .forEach(i -> printResult(i, Fibonacci::fibonacci));

        System.out.println("===========================");

        /*
        IntStream.rangeClosed(0, 10)
                 .forEach(i -> printResult(i, Fibonacci::fibonacciIterative));
                 */

        System.out.println(fibonacciStream(10));
    }

    private static Integer fibonacciIterative(Integer integer) {

        if(integer <= 1) {
            return integer;
        }

        int fib = 1;
        int prevFib = 1;

        for(int i = 2; i < integer; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }

        return fib;
    }

    private static List<Integer> fibonacciStream(Integer series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                     .limit(series)
                     .map(n -> n[0])
                     .collect(toList());
    }

    private static BigInteger fibonacci(Integer integer) {
        if(integer == 0) {
            return BigInteger.ZERO;
        }

        if(integer == 1) {
            return BigInteger.ONE;
        }

        BigInteger cachedFibonacci = cache.get(integer);
        if(cachedFibonacci != null) {
            //System.out.println("Cache hit: " + integer + ": " + cachedFibonacci);
            return cachedFibonacci;
        }

        BigInteger newFibonacci = fibonacci(integer - 1).add(fibonacci(integer - 2));
        cache.put(integer, newFibonacci);
        return newFibonacci;
    }

    /*
    private static void printResult(Integer integer, Function<Integer, Integer> fibonacci) {
        String s = String.format("%1$10s", integer);
        System.out.println(s+": " + fibonacci.apply(integer));
    }
    */

    private static void printResult(Integer integer, Function<Integer, BigInteger> fibonacci) {
        String s = String.format("%1$10s", integer);
        System.out.println(s+": " + fibonacci.apply(integer));
    }
}
