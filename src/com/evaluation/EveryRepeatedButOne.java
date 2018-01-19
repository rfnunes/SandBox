package com.evaluation;

public class EveryRepeatedButOne {

    public static void main(String[] args) {
        new EveryRepeatedButOne().go(new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5});
    }

    private void go(int[] ints) {

        new QuickSort().sort(ints, 0, ints.length - 1);

        for (int i = 0; i < ints.length - 2; i++) {
            if(ints[i] == ints[i+1]) {
                continue;
            }

            if(ints[i+1] != ints[i+2]) {
                System.out.println(ints[i+1]);
//                break;
            }
        }
    }
}
