package com.evaluation;

import java.util.Arrays;
import java.util.Objects;

import com.util.LinkedList;
import com.util.LinkedList.LinkedListNode;

public class Palindrome {

    public static void main(String[] args) {
/*
        Arrays.asList(0, 1, 10, 11, 1200, 1221, 33033, 33333)
              .forEach(Palindrome::printResult);

        Arrays.asList("010", "011", "Ana", "Carla", "Hannah")
              .forEach(Palindrome::printResult);

        Arrays.asList("010", "011", "Ana", "Carla", "Hannah")
              .forEach(Palindrome::printResult2);
*/

        Arrays.asList("010", "011", "Ana", "Carla", "Hannah")
              .forEach(Palindrome::printResultLinkedList);
    }

    private static void printResultLinkedList(String string) {
        String s = string.toLowerCase();
        LinkedList<Character> linkedList = new LinkedList<>(null);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            linkedList.add(new LinkedListNode<>(aChar));
        }
        LinkedList<Character> reverse = LinkedList.reverse(linkedList);
        System.out.println(string + ": " + linkedList.equals(reverse));
    }

    private static void printResult(String word) {
        String s = String.format("%1$10s", word);
        System.out.println(s+": " + isPalindromeStringRecursive(word));
    }

    private static void printResult2(String word) {
        String s = String.format("%1$10s", word);
        System.out.println(s+": " + isPalindrome2(word));
    }

    private static boolean isPalindrome2(String word) {
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        for (int i = 0; i <= chars.length / 2; i++) {
            if (chars[i] != chars[chars.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(String palindrome) {

        Objects.requireNonNull(palindrome);

        String word = palindrome;

        StringBuilder reverse = new StringBuilder();

        while (!word.isEmpty()) {
            char c = word.charAt(word.length()-1);
            reverse.append(c);
            word = word.substring(0, word.length()-1);
        }

        return palindrome.equalsIgnoreCase(reverse.toString());
    }

    private static boolean isPalindromeStringRecursive(String palindrome) {

        Objects.requireNonNull(palindrome);

        String reverse = reverse(palindrome);

        return palindrome.equalsIgnoreCase(reverse);
    }

    private static String reverse(String word) {
        if(word.isEmpty()) {
            return "";
        }

        int pos = word.length() - 1;
        return word.charAt(pos) + reverse(word.substring(0, pos));
    }

    private static boolean isPalindromeArrayRecursive(String palindrome) {

        Objects.requireNonNull(palindrome);

        char[] word = palindrome.toCharArray();

        for(int i = 0; i < word.length; i++) {
            word[i] = Character.toLowerCase(word[i]);
        }

        char[] reverse = reverseArray(word);

        for(int i = 0; i < word.length; i++) {
            if(word[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    private static char[] reverseArray(char[] word) {
        if(word.length == 0) {
            return new char[]{};
        }

        int pos = word.length - 1;
        return concat(new char[]{word[pos]}, reverseArray(subArray(word, pos)));
    }

    private static char[] subArray(char[] word, int pos) {
        char[] subArray = new char[pos];
        for(int i = 0; i < pos; i++) {
            subArray[i] = word[i];
        }
        return subArray;
    }

    private static char[] concat(char[] a, char[] b) {
        char[] res = new char[a.length+b.length];

        arrayCopy(res, a, 0);
        arrayCopy(res, b, a.length);

        return res;
    }

    private static void arrayCopy(char[] res, char[] a, int i) {
        System.arraycopy(a, 0, res, i, a.length);
    }

    private static void printResult(Integer i) {
        String s = String.format("%1$10s", i);
        System.out.println(s+": " + isPalindrome(i));
    }

    private static boolean isPalindrome(Integer palindrome) {

        int number = palindrome;
        int reverse = 0;

        while (number > 0) {
            int rest = number % 10;
            reverse = reverse * 10 + rest;
            number = number / 10;
        }

        return reverse == palindrome;
    }
}
