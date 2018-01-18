package com.evaluation;

import java.util.Arrays;

public class RemovedDuplicatesArray {

    public static void main(String[] args) {
        new RemovedDuplicatesArray().go(new int[]{1, 2, 1, 2, 3, 4, 5});
    }

    private void go(int[] ints) {

        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length - 1; j++) {
                if(ints[j] != -1 && ints[i] == ints[j]) {
                    count++;
                    ints[j] = -1;
                }
            }
        }

        int[] res = new int[ints.length-count];
        int index = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != -1) {
                res[index] = ints[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
