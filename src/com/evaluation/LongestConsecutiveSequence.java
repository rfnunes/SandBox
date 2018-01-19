package com.evaluation;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        new LongestConsecutiveSequence().go(new int[]{0,1,2,3,4,5,6,8,9,11,12,13,14,15,16,17,18,19});
    }

    private void go(int[] ints) {
        int max = 0;
        int count = 1;

        for (int i = 0; i < ints.length-1; i++) {
            if(ints[i] == ints[i+1] - 1) {
                count++;
            }
            else {
                count = 1;
            }

            if(count > max) {
                    max = count;
            }
        }

        System.out.println(max);
    }
}
