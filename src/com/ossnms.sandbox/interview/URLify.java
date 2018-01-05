package com.ossnms.sandbox.interview;

import com.util.Util;

public class URLify {

    public static void main(String[] args) {
        new URLify().go("http://www.sapo.pt/My Web Page.html      ");
    }

    private void go(String s) {
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length-3; i++) {
            char c = chars[i];
            if(c == ' ') {
                for(int j = chars.length - 4; j >= i; j--) {
                    chars[j+3] = chars[j+2];
                    chars[j+2] = chars[j+1];
                    chars[j+1] = chars[j];
                }
                chars[i] = '%';
                chars[i+1] = '2';
                chars[i+2] = '0';
            }
        }

        System.out.println(Util.getArrayAsString(chars, false));
    }
}
