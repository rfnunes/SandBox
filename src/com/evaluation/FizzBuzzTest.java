package com.evaluation;

import java.util.stream.IntStream;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ+BUZZ;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                 .mapToObj(FizzBuzzTest::fizzBuzz)
                 .forEach(System.out::println);
    }

    private static String fizzBuzz(int i) {

        String out = String.valueOf(i);

        if(i % (5*3) == 0) {
            out = FIZZ_BUZZ;
        }
        else if(i % 5 == 0) {
            out = BUZZ;
        }
        else if(i % 3 == 0) {
            out = FIZZ;
        }

        return out;
    }
}
