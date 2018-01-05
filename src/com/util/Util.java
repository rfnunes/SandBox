package com.util;

public final class Util {

    private Util() {
        //Hide utility class c'tor
    }

    public static String getArrayAsString(char[] array, boolean separate) {
        StringBuilder sb = new StringBuilder(array.length);
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(separate && i < array.length) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public static String getIntArrayAsString(int[] array) {
        StringBuilder sb = new StringBuilder(array.length);
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
