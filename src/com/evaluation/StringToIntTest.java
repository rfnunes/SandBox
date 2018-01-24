package com.evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringToIntTest {

    @ParameterizedTest
    @CsvSource({
            "1234, 1234",
            "+1, 1",
            "-20, -20",
            "0.01, 0.01",
            "-3.14, -3.14",
            "10000000, 10000000"
    })
    void go(String s, Float i) {
        String x = new String("abc");
        System.out.println(x);
        //assertEquals(i, new StringToInt().go(s));
    }
}