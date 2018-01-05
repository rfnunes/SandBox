package com.ossnms.sandbox.interview;

public class OneAway {

    public static void main(String[] args) {
        new OneAway().go();
    }

    private void go() {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bae"));
    }

    private boolean isOneAway(String a, String b) {
        boolean res = false;

        if(Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        int diff = a.length() - b.length();

        switch (diff) {
            case 1:
                res = charRemoved(a, b);
                break;
            case 0:
                res = charEdited(a, b);
                break;
            case -1:
                res = charAdded(a, b);
                break;
            default:
                    break;
        }

        return res;
    }

    private boolean charAdded(String a, String b) {
        return false;
    }

    private boolean charEdited(String a, String b) {
        return false;
    }

    private boolean charRemoved(String a, String b) {
        boolean res;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int count = 0;
        int deletion = 0;
        for (int i = 0; i < charsA.length - 1; i++) {
            if(charsA[i] == charsB[i-deletion]) {
                count++;
            }
            else {
                deletion++;
            }
        }
        res = count == a.length() - 1;
        return res;
    }
}
