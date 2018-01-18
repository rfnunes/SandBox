package com.evaluation;

public class ArrayHasNumber {

    public static void main(String[] args) {
        new ArrayHasNumber().go();
    }

    private void go() {

        int[] ints = new int[]{2,45,6,12,876};

        new BubbleSort().bubbleSort(ints);

        System.out.println(binarySearch(ints, 0, ints.length -1, 2) != -1);
        System.out.println(hasNumber(ints, 2) != -1);

    }

    private int hasNumber(int[] ints, int n) {
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == n) {
                return n;
            }
        }
        return -1;
    }

    private int binarySearch(int[] ints, int l, int r, int i) {

        if(r >= l) {

            int mid = (l + r) / 2;
            if(ints[mid] == i) {
                return i;
            }
            if(ints[mid] > i) {
                return binarySearch(ints, l, mid - 1, i);
            }
            return binarySearch(ints, mid + 1, r, i);

        }
        return - 1;
    }


}
