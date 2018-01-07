package com.evaluation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] ints = {3, 9, 4, 12, 1, 2};
        //int[] sort = bubbleSort.sort(ints);
        /*
        printArray(bubbleSort.sort(ints));
        printArray(bubbleSort.sort(ints));
        printArray(bubbleSort.sort(ints));
        printArray(bubbleSort.sort(ints));
        */
        bubbleSort.sort(ints);
    }

    private static void printArray(int[] sort) {
        System.out.println(getArrayString(sort));
    }

    private static String getArrayString(int[] sort) {
        return Arrays.stream(sort)
                     .boxed()
                     .map(String::valueOf)
                     .collect(Collectors.joining(", "));
    }

    private int[] sort(int[] array) {

        final int n = array.length;

        boolean unordered = true;

        while(unordered) {
            unordered = false;
            for(int j = 0; j < n - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    unordered = true;
                }
            }

            System.out.println(": "+getArrayString(array));
        }

        return array;
    }
}
