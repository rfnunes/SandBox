package com.evaluation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BinarySearchTest {
    private static final int[] array = new int[]{1, 5, 6};

    private static final BinarySearch binarySearch = new BinarySearch();

    @Test
    @ParameterizedTest(name = "{index} => i={0}, res={1}")
    @CsvSource({
            "1, 0",
            "2, -1",
            "3, -1",
            "4, -1",
            "5, 1",
            "6, 2",
            "7, -1",
            "8, -1",
            "9, -1",
    })
    void test(int i, int res) {
        assertEquals(res, binarySearch.go(array, i));
    }

}