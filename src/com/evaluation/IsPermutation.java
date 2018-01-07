package com.evaluation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsPermutation {

    public static void main(String[] args) {
        new IsPermutation().go();
    }

    private void go() {
        System.out.println(isPermutation("bca", "abc"));
    }

    private boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        Map<Character, Long> collectA = getOccurrenceMap(a);

        Map<Character, Long> collectB = getOccurrenceMap(b);

        return collectA.equals(collectB);
    }

    private Map<Character, Long> getOccurrenceMap(String a) {
        return a.chars().mapToObj(c -> (((char) c)))
                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
