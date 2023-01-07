package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int col = 0;
        double sum = 0;
        double[] digits = {-7.0, 17.0, 1.0, -8.0, 5.0, 6.0, -2.0, 3.0, 12.0, -7.0, 8.0, 14.0, -11.0, 15.0, -6.0};
        for (double digits1 : digits) {
            if (digits1 > 0) {
                col++;
                sum += digits1;
            }
        }
        System.out.println(sum + "/" + col + "=" + sum / col);
        main2();
    }

        public static void main2() {
            int[] array = {8, 3, 2, -2, 6, -4};
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                    }

                }
                System.out.println(Arrays.toString(array));
            }

        }

    }



