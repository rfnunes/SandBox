package com.evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StringDuplicatesTest {

    private StringDuplicates stringDuplicates;

    static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abc", Collections.emptySet()),
                Arguments.of("abbc", Collections.singleton('b')),
                Arguments.of("Java", Collections.singleton('a')),
                Arguments.of("Javvva", Stream.of('a','v').collect(Collectors.toSet()))
        );
    }

    @BeforeEach
    void setUp() {
        stringDuplicates = new StringDuplicates();
    }

    @Test
    @DisplayName("Test nullity")
    void nullTest() {
        assertTrue(stringDuplicates.findDuplicates(null).isEmpty());
    }

    @Test
    @DisplayName("Test emptiness")
    void emptinessTest() {
        assertTrue(stringDuplicates.findDuplicates("").isEmpty());
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void test(String s, Set<Character> expected) {
        assertEquals(expected, stringDuplicates.findDuplicates(s));
    }
}