package com.evaluation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnagramsTest {

    private Anagrams anagrams;

    @BeforeEach
    void setUp() {
        anagrams = new Anagrams();
    }

    @ParameterizedTest
    @CsvSource({
            "Army, Mary, true",
            "Amor, Roma, true",
            "Ricardo, Nunes, false",
            "abcde, fghij, false"
    })
    void areAnagrams(String a, String b, boolean expectedResult) {
        assertEquals(expectedResult, anagrams.areAnagrams(a, b));
    }

    @Test
    @DisplayName("Expect exception")
    void exception() {
        assertThrows(NullPointerException.class,
                     () -> anagrams.areAnagrams(null, ""));

        assertThrows(NullPointerException.class,
                     () -> anagrams.areAnagrams("", null));
    }
}