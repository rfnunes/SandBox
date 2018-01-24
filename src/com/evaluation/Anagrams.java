package com.evaluation;

import java.util.Arrays;
import java.util.Objects;

public class Anagrams {

    public boolean areAnagrams(String a, String b) {

        Objects.nonNull(a);
        Objects.nonNull(b);

        if(a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        //sort(charsA, 0, charsA.length - 1);
        //sort(charsB, 0, charsB.length - 1);

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        return compareArrays(charsA, charsB);
    }

    private boolean compareArrays(char[] charsA, char[] charsB) {

        for (int i = 0; i < charsA.length; i++) {
            if(charsA[i] != charsB[i]) {
                return false;
            }
        }

        return true;
    }

    private void sort(char[] chars, int l, int r) {

        if (l < r) {
            int p = partition(chars, l, r);

            sort(chars, l, p - 1);
            sort(chars, p + 1, r);
        }
    }

    private int partition(char[] chars, int l, int r) {


        char pivot = chars[r];
        int i = l - 1;

        for (int j = 0; j < r - 1; j++) {
            if (chars[j] <= pivot) {
                i++;
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }

        char temp = chars[i + 1];
        chars[i + 1] = chars[r];
        chars[r] = temp;

        return i + 1;
    }
}
