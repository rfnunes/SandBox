package com.evaluation;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        Random rSize = new Random();
        Random rNumber = new Random();

        Stream.generate(() -> rNumber.ints(0, 50).limit(rSize.nextInt(10)).toArray())
              .peek(a -> System.out.println(Arrays.toString(a)))
              .limit(5)
              .forEach(intArray -> System.out.println(Arrays.toString(bubbleSort.bubbleSort(intArray))));
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

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private int[] sortAlternative(int[] array) {

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
