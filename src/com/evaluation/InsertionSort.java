package com.evaluation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] ints = {};
        insertionSort.sort(ints);

        System.out.println(ints);
    }

    private void sort(int[] array) {
        final int n = array.length;
        int lowerValue = array[0];

        for(int i = 1; i < n - 1; i++) {
            if(array[i] < lowerValue) {
                int newLowerValue = array[i];
            }
        }
    }

    private static String getArrayString(int[] array) {
        return Arrays.stream(array)
                     .boxed()
                     .map(String::valueOf)
                     .collect(Collectors.joining(", "));
    }
}
