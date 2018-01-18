package com.evaluation;

public class DuplicateNumber {

    public static void main(String[] args) {
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        duplicateNumber.go();
    }

    private void go() {
        int[] ints = new int[]{0,3,1,2,3};

        int count = 0;
        for(int i = 1; i <= ints.length - 2; i++) {
            count += i;
        }

        int res = 0;
        for (int i = 0; i < ints.length; i++) {
            res += ints[i];
        }

        System.out.println(res-count);
    }
}
