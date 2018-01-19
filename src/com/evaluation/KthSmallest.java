package com.evaluation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthSmallest {

    public static void main(String[] args) {
        new KthSmallest().go(new int[]{20, 34, 21, 87, 92, 2147483647});
    }

    private void go(int[] ints) {

        Integer[] integers = new HashSet<>(Arrays.asList(ints)).toArray(new Integer[0]);


        int topOne = Integer.MIN_VALUE;
        int topTwo = topOne;

        for (int number : ints) {
            if(number > topOne) {
                topTwo = topOne;
                topOne = number;
            } else
            if(number > topTwo) {
                topTwo = number;
            }
        }

        System.out.println("One: " +  topOne);
        System.out.println("Two: " +  topTwo);
    }
}
