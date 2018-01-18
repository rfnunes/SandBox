package com.evaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DupInArray {

    public static void main(String[] args) {
        new DupInArray().go();
    }

    private void go() {
        int[] ints = IntStream.rangeClosed(1, 100)
                              .toArray();

        for(int i = 0; i < ints.length; i = i + 10) {
            ints[i] = i / 10 + 1;
        }

        System.out.println(Arrays.toString(ints));

        System.out.println(whichDup(ints));
        System.out.println(allDups(ints));
    }

    private Set<Integer> allDups(int[] ints) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            int val = ints[i];
            countMap.putIfAbsent(val, 0);
            countMap.computeIfPresent(val, (a,b) -> b+1);
        }

        return
        countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    private int whichDup(int[] ints) {
        Set<Integer> dups = new HashSet<>(ints.length);
        for(int i = 0; i < ints.length; i++) {
            boolean add = dups.add(ints[i]);
            if(!add) {
                return ints[i];
            }
        }
        return -1;
    }
}
