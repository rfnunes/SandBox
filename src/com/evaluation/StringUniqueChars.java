package com.evaluation;

import java.util.Scanner;

public class StringUniqueChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.next();
        scanner.close();

        new StringUniqueChars().go(string);
    }

    private void go(String string) {

        char[] chars = string.toCharArray();
        bubbleSort(chars);

        //System.out.println(getArrayString(chars));

        System.out.println(areUnique2(string));
    }

    private boolean areUnique(char[] chars) {
        for(int i = 0; i < chars.length -1; i++) {
            for(int j = i + 1; j < chars.length - 1; j++) {
                if(chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean areUnique2(String string) {

        boolean[] control = new boolean[128];

        for(int i = 0; i < string.length() -1; i++) {
            int val = string.charAt(i);
            if(control[val]) {
                return false;
            }
            control[val] = true;
        }
        return true;
    }

    private void bubbleSort(char[] chars) {

        for(int i = 0; i < chars.length - 1; i++) {
            for(int j = 0; j < chars.length - i - 1; j++) {
                if(chars[j] > chars[j+1]) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
    }

    private static String getArrayString(char[] sort) {
        StringBuilder sb = new StringBuilder(sort.length);
        for (char aSort : sort) {
            sb.append(aSort);
        }
        return sb.toString();
    }
}
