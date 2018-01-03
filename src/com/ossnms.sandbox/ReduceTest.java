package com.ossnms.sandbox;

import java.util.stream.Stream;

/**
 * Created by pt102933 on 4/5/2017.
 */
public class ReduceTest {

    public static void main(String[] args) {
        new ReduceTest().go();
    }

    private void go() {
        System.out.println(
                Stream.of(true, true, true, false)
                      .reduce((a, b) -> a || b));

    }
}
