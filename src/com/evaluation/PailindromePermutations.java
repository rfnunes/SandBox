package com.evaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class PailindromePermutations {

    public static void main(String[] args) {
        new PailindromePermutations().go(Arrays.asList("Naa", "Noa", "Hhaann"));
    }

    private void go(List<String> stringList) {
        stringList.forEach(this::isPalindromePermutation);
    }

    private void isPalindromePermutation(String s) {
        s = s.toLowerCase();
        final Map<Character, Integer> occurrenceMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if(occurrenceMap.get(c) == null) {
                occurrenceMap.put(c, 1);
            }
            else {
                occurrenceMap.put(c, occurrenceMap.get(c)+1);
            }
        }

        boolean res;

        int occur2 = 0;
        int occur1 = 0;

        for (Integer integer : occurrenceMap.values()) {
            occur2 += integer == 2 ? 1 : 0;
            occur1 += integer == 1 ? 1 : 0;
        }

        if(s.length() % 2 == 0) {
            res = occur1 == 0 && occur2 == occurrenceMap.size();
            //res = occurrenceMap.values().stream().allMatch(x -> x.equals(2));
        }
        else {
            res = occur1 == 1 && occur2 == occurrenceMap.size() - 1 ;
            //res = occurrenceMap.values().stream().filter(x -> x.equals(2)).count() == occurrenceMap.size() - 1;
            //res = res && occurrenceMap.values().stream().filter(x -> x.equals(1)).count() == 1;
        }

        System.out.println(s + ": "+ res);
    }
}
