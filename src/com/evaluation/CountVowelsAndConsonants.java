package com.evaluation;

import java.util.EnumSet;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountVowelsAndConsonants {

    private static final String PROMPT = "Escreva uma palavra por favor:";

    private static final String OUTPUT = "A sua palavra contém %d vogais e %d consoantes.";

    private static final String VOWELS = "[aeiouAEIOU]";

    private static final String IGNORE = "[,.!? ]";

    public enum LetterType {
        VOWEL, CONSONANT
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(PROMPT);
            String word = scanner.nextLine();

            if(word.equalsIgnoreCase(".")) {
                System.exit(0);
            }

            Map<LetterType, Integer> count = new CountVowelsAndConsonants().count(word);
            System.out.println(String.format(OUTPUT, count.get(LetterType.VOWEL), count.get(LetterType.CONSONANT)));
        }
    }

    public Map<LetterType, Integer> count(String s) {
        Map<LetterType, Integer> map = EnumSet.allOf(LetterType.class)
                                              .stream()
                                              .collect(Collectors.toMap(Function.identity(), x -> 0));

        Pattern pattern = Pattern.compile(VOWELS);

        while(!s.isEmpty()) {
            char c = s.charAt(s.length() - 1);
            if((""+c).matches(IGNORE)) {
                s = s.substring(0, s.length() - 1);
                continue;
            }
            if(pattern.matcher(""+c).find()) {
                map.compute(LetterType.VOWEL, (k, v) -> v+1);
            }
            else {
                map.compute(LetterType.CONSONANT, (k, v) -> v+1);
            }
            s = s.substring(0, s.length() - 1);
        }

        return map;
    }
}
