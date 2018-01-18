package com.evaluation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class MissingNumberTest {

    @Test
    void go() {
        MissingNumber missingNumber = new MissingNumber();

        IntStream.rangeClosed(1, MissingNumber.MAX)
                 .forEach(v -> assertEquals(v, missingNumber.go(v)));
    }
}