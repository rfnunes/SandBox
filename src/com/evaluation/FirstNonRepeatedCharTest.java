package com.evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstNonRepeatedCharTest {

    private FirstNonRepeatedChar firstNonRepeatedChar;

    @BeforeEach
    void setUp() {
        firstNonRepeatedChar = new FirstNonRepeatedChar();
    }

    @ParameterizedTest
    @CsvSource({
            "Morning, M",
            "voo, v",
            "aabc, b",
            "aabbc, c"
    })
    void firstNonRepeated(String s, Character expected) {
        assertEquals(expected, firstNonRepeatedChar.firstNonRepeated(s).get());
    }

    @Test
    void testEmpty() {
        assertFalse(firstNonRepeatedChar.firstNonRepeated("").isPresent());
    }

    @Test
    void assertNull() {
        assertThrows(NullPointerException.class, () -> firstNonRepeatedChar.firstNonRepeated(null));
    }
}