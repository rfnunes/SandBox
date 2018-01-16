package com.evaluation;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.go(new int[]{1,2,3,4,5,6,7,9}, 1));
        System.out.println(binarySearch.go(new int[]{1,2,3,4,5,6,7,9}, 8));
    }

    public int go(int[] ints, int i) {
        return binarySearch(ints, 0, ints.length - 1, i);
    }

    private int binarySearch(int[] ints, int l, int r, int i) {
        if(r >= l) {
            int mid = (l + r)/2;
            if (ints[mid] == i) {
                return mid;
            }
            if (ints[mid] > i) {
                return binarySearch(ints, l, mid - 1, i);
            }

            return binarySearch(ints, mid + 1, r, i);
        }
        return -1;
    }
}
