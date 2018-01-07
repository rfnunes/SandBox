package com.evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Permutations {

    public static void main(String[] args) {
        new Permutations().go();
    }

    private void go() {
        /*
        List<String> res = getPermutations("abbc", "cbabadcbbabbcbabaabccbabc");
        res.forEach(System.out::println);
        System.out.println(res.size());
        */

        List<String> res = getPermutations("abcd");
        res.forEach(System.out::println);
        System.out.println(res.size());
    }

    private List<String> getPermutations(String s) {

        if(s.length() == 2) {
            List<String> res = new ArrayList<>(2);
            res.add(s);
            res.add(String.valueOf(s.charAt(1)) + String.valueOf(s.charAt(0)));
            return res;
        }

        char lastChar = s.charAt(s.length() - 1);

        List<String> permutations = getPermutations(s.substring(0, s.length() - 1));

        return insertChar(lastChar, permutations);
    }

    private List<String> insertChar(char lastChar, List<String> strings) {
        List<String> res = new ArrayList<>();
        for (String string : strings) {
            for(int i = 0; i <= string.length(); i++) {
                if(i == 0) {
                    res.add(lastChar + string);
                }
                else if (i == string.length()){
                    res.add(string + lastChar);
                }
                else {
                    res.add(string.substring(0, i) + lastChar + string.substring(i));
                }
            }
        }
        return res;
    }

    private List<String> getPermutations(String base, String compare) {

        final List<String> res = new ArrayList<>();

        Map<Character, Long> charMap = getMap(base);

        for(int i = 0; i < compare.length()-3; i++) {
            String sub = compare.substring(i, i+4);
            Map<Character, Long> subMap = getMap(sub);
            if(subMap.equals(charMap)) {
                res.add(sub);
            }
        }

        return res;
    }

    private Map<Character, Long> getMap(String base) {
        return base.chars().mapToObj(c -> (((char) c)))
                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
