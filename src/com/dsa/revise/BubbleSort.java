package com.dsa.revise;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {31, 5, 7, 45, 60, 4};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 - i; i++) {
            boolean swapped = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
