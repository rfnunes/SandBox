package com.evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RecursiveMultiplyTest {

    private final RecursiveMultiply multiply = new RecursiveMultiply();

    @DisplayName("Should calculate the correct multiplication")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, multiply={2}")
    @CsvSource({
            "1, 1, 1",
            "1, 2, 2",
            "2, 1, 2",
            "3, 5, 15",
            "5, 5, 25",
            "5, 10, 50",
            "-5, 10, -50"
    })
    void sum(int a, int b, int mult) {
        assertEquals(mult, multiply.multiply(a, b));
    }

}