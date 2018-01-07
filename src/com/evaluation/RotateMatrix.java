package com.evaluation;

import java.rmi.server.RMIClassLoader;

import com.util.Util;

public class RotateMatrix {

    public static void main(String[] args) {
        new RotateMatrix().go();
    }

    private void go() {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int[] ints : matrix) {
            System.out.println(Util.getIntArrayAsString(ints));
        }

        System.out.println("===========================");
        
        int[][] rotate = rotateMatrix(matrix);

        for (int[] ints : rotate) {
            System.out.println(Util.getIntArrayAsString(ints));
        }
    }

    private int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] dest = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dest[i][j] = matrix[n - 1 - j][i];
            }
        }
        return dest;
    }
}
