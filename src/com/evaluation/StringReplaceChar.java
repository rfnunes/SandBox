package com.evaluation;

public class StringReplaceChar {

    public static void main(String[] args) {
        System.out.println(replace("", 'i', 'o'));
        System.out.println(replace("Helli Wirld!", 'i', 'o'));
        System.out.println(replaceRecursive("", 'i', 'o'));
        System.out.println(replaceRecursive("Helli Wirld!", 'i', 'o'));
    }

    private static String replace(String s, char i, char o) {

        StringBuilder res = new StringBuilder();

        for(int n = 0; n < s.length(); n++) {
            char c = s.charAt(n);
            if(c == i) {
                c = o;
            }
            res.append(c);
        }

        return res.toString();
    }

    private static String replaceRecursive(String s, char i, char o) {

        if(s.isEmpty()) {
            return "";
        }

        char c = s.charAt(0);
        if(c == i) {
            c = o;
        }

        return c + replaceRecursive(s.substring(1), i, o);
    }
}
