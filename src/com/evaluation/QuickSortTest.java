package com.evaluation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void sort() {
        int[] unsorted = {1,3,4,5,2,0};
        int[] sorted =   {0,1,2,3,4,5};

        new QuickSort().sort(unsorted, 0, unsorted.length - 1);
        assertArrayEquals(sorted, unsorted);
    }
}