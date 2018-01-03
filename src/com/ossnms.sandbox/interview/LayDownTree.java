package com.ossnms.sandbox.interview;

import java.util.Scanner;

public class LayDownTree {

    public static void main(String[] args) {
        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        new LayDownTree().go(num);
    }

    private void go(int num) {

        int direction = 1;
        int count = 2;

        for(int i = 1; count >= 0 && (i <= num || i >= 1); i = (i + 2 * direction)) {
            StringBuilder sb = new StringBuilder(i);
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());

            if(i <= 1) {
                direction = 1;
                count--;
            }
            else if(i >= num) {
                direction = -1;
                count--;
            }

        }
/*
        for(int i = num - 2; i >= 1; i = i - 2) {
            StringBuilder sb = new StringBuilder(i);
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
*/
    }
}
