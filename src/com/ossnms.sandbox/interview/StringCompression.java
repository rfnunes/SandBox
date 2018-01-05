package com.ossnms.sandbox.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompression {

    public static void main(String[] args) {
        new StringCompression().go();
    }

    private void go() {
        System.out.println(compress("aabcccccaaa").equals("a2b1c5a3"));
        System.out.println(compress("abc").equals("abc"));
        System.out.println(compress("a").equals("a"));
    }

    private String compress(String string) {
        final StringBuilder sb = new StringBuilder(string.length());

        char[] chars = string.toCharArray();

        int count = 1;

        char currChar = chars[0];

        for (int i = 0; i < chars.length - 1; i++) {
            currChar = chars[i];

            if(chars[i+1] == currChar) {
                count++;
            }
            else {
                sb.append(currChar).append(count);
                count = 1;
            }
        }

        sb.append(currChar).append(count);

        String collect = sb.toString();

        System.out.println(collect);

        if(collect.length() > string.length()) {
            return string;
        }

        return collect;
    }
}
