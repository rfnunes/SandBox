package com.ossnms.sandbox.interview;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                 .forEach(i -> Factorial.printResult(i, Factorial::factorial));

        System.out.println("================");

        IntStream.rangeClosed(0, 10)
                 .boxed()
                 .forEach(i -> Factorial.printResult(i, Factorial::factorialRecursive));
    }

    private static void printResult(Integer integer, Function<Integer, Integer> factorial) {
        String s = String.format("%1$10s", integer);
        System.out.println(s+": " + factorial.apply(integer));
    }

    private static Integer factorial(Integer integer) {
        int res = integer;

        for(int i = integer - 1; i > 0; i--) {
            res *= i;
        }

        return res;
    }

    private static Integer factorialRecursive(Integer integer) {
        if(integer == 0) {
            return 1;
        }

        return integer * factorialRecursive(integer-1);
    }
}
