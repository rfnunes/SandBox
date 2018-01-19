package com.evaluation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDuplicates {

    public Set<Character> findDuplicates(String s) {

        if(s == null || s.isEmpty()) {
            return Collections.emptySet();
        }

        s = s.toLowerCase();

        char[] chars = s.toCharArray();

        Map<Character, Integer> dupMap = new HashMap<>();

        for (char aChar : chars) {
            dupMap.putIfAbsent(aChar, 0);
            dupMap.computeIfPresent(aChar, (k, v) -> v + 1);
        }

        return dupMap.entrySet()
                     .stream()
                     .filter(e -> e.getValue() > 1)
                     .map(HashMap.Entry::getKey)
                     .collect(Collectors.toSet());
    }
}
