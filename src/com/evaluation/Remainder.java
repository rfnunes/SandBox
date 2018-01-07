package com.evaluation;

import java.util.stream.IntStream;

public class Remainder {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                 .map(i -> i % 11)
                 .forEach(System.out::println);

        System.out.println(7 % 2);
    }

}

