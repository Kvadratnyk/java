package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int sizeArray = (int) (Math.random() * 4);
        int[][] array = new int[sizeArray][sizeArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) Math.round((Math.random() * 9));
            }
        }
        printArray(array);
        System.out.println(Arrays.toString(fillArray(0, 10, 2)));
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[] fillArray(int begin, int end, int step) {
        int index = 0;
        int maxSum = begin;
        while (end>=maxSum){
            maxSum += step;
            index++;
        }
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            array[i] += begin;
            begin = array[i] + step;
        }
        return array;
    }
}
