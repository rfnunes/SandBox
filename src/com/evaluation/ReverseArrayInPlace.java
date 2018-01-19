package com.evaluation;

import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        new ReverseArrayInPlace().go(new int[]{1,2,3,4,5,6});
    }

    private void go(int[] ints) {

        for(int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length-1-i];
            ints[ints.length - 1-i] = temp;
        }

        System.out.println(Arrays.toString(ints));
    }
}
