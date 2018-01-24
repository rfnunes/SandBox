package com.evaluation;

public class StringToInt {

    public static void main(String[] args) {
        new StringToInt().go("+1345");
    }

    public Float go(String s) {
        int acc = 0;
        int fra = 0;
        int sign = 1;
        boolean isDecimal = false;
        float res = 0;

        while(!s.isEmpty()) {
            char c = s.charAt(0);

            if(c == '-') {
                sign = -1;
                s = s.substring(1);
                continue;
            }
            else if(c == '+') {
                s = s.substring(1);
                continue;
            }
            else if(c == '.' || c == ',') {
                isDecimal = true;
                s = s.substring(1);
                continue;
            }

            Integer integer = Integer.valueOf("" + c);

            if(!isDecimal) {
                acc = acc * 10 + integer;
            }
            else {
                fra = fra * 10 + integer;
            }
            s = s.substring(1);
        }

        res  = acc;

        if(isDecimal) {
            res = acc + ((float) fra / 100);
        }

        return sign*res;
    }
}
