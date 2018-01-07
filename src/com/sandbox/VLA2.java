package com.ossnms.sandbox;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2> {

    static String s;

    int dishSize;

    public static void main(String[] args) {
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
        Arrays.sort(va, va[0]);
        int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.print(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), va[0]);
        System.out.print(index);

    }

    public int compare(VLA2 a, VLA2 b) {
        return a.dishSize - b.dishSize;
    }

    VLA2(int d) {
        dishSize = d;
    }
}

class Game {
    static String s = "-";
    String s2 = "s2";

    Game(String arg) {
        s += arg;
    }
}

