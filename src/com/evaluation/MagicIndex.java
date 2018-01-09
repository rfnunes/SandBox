package com.evaluation;

public class MagicIndex {

    public static void main(String[] args) {
        int i = new MagicIndex().magicIndex(new int[]{-1, 0, 2, 3, 5, 7});
        System.out.println(i);
    }

    private int magicIndex(int[] ints) {
        return magicIndex(ints, 0, ints.length);
    }

    private int magicIndex(int[] ints, int start, int end) {
        if(end < start) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(ints[mid] == mid) {
            return mid;
        }
        else if(ints[mid] > mid) {
            return magicIndex(ints, start, mid - 1);
        }
        else {
            return magicIndex(ints, mid + 1, end);
        }
    }
}
