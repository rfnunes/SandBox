package com.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPairsWithSum {

    public static void main(String[] args) {
        new AllPairsWithSum().go(new int[]{-2, -1, 0,1,2,3,4,5,6,7}, 5);
    }

    private void go(int[] ints, int n) {
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {
            for(int j = i; j < ints.length; j++) {
                if(ints[i]+ints[j] == n) {
                    pairs.add(new int[]{ints[i], ints[j]});
                }
            }
        }

        pairs.forEach(p -> System.out.println(Arrays.toString(p)));
    }
}
