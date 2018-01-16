package com.evaluation;

public class StringToInt {

    public static void main(String[] args) {
        new StringToInt().go();
    }

    private void go() {
        String s = "1345";
        int acc = 0;

        while(!s.isEmpty()) {
            char c = s.charAt(0);
            acc = acc * 10 + Integer.valueOf(""+c);
            s = s.substring(1);
        }

        System.out.println(acc);
    }
}
