package com.evaluation;

public class FindLargestAndSmallestInArray {

    public static void main(String[] args) {
        new FindLargestAndSmallestInArray().go();
    }

    private void go() {

        int[] ints = new int[]{2,45,6,12,876};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int val : ints) {
            if (val >= largest) {
                largest = val;
            }
            if (val <= smallest) {
                smallest = val;
            }
        }

        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
}
