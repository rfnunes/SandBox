package com.evaluation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class FirstNonRepeatedChar {

    public Optional<Character> firstNonRepeated(String s) {

        Objects.nonNull(s);

        if(s.isEmpty()) {
            return Optional.empty();
        }

        //s = s.toLowerCase();

        char[] chars = s.toCharArray();

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char aChar : chars) {
            countMap.putIfAbsent(aChar, 0);
            countMap.computeIfPresent(aChar, (k, v) -> v + 1);
        }

        return
        countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
