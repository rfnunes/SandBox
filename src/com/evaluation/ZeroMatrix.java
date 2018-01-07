package com.evaluation;

import com.util.Util;

public class ZeroMatrix {

    public static void main(String[] args) {
        new ZeroMatrix().go();
    }

    private void go() {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,0}};
        int[][] res = zeroMatrix(matrix);
        for (int[] re : res) {
            System.out.println(Util.getIntArrayAsString(re));
        }
    }

    private int[][] zeroMatrix(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if(row[i]) {
                for (int i1 = 0; i1 < matrix[i].length; i1++) {
                    matrix[i][i1] = 0;
                }
            }
        }

        for (int i = 0; i < column.length; i++) {
            if(column[i]) {
                for (int i1 = 0; i1 < matrix.length; i1++) {
                    matrix[i1][i] = 0;
                }
            }
        }

        return matrix;
    }
}
