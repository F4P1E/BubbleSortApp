package com.syntaxsociety;

import java.util.Arrays;

public class BubbleSort {

    public static Integer[] sort(Integer[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    public static void main(String[] args) {
        // For quick standalone testing
        Integer[] test = {70, 61, 72, 83, 38};
        System.out.println(Arrays.toString(sort(test)));
    }
}