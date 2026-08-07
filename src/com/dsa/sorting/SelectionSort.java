package com.dsa.sorting;
//Selection Sort repeatedly finds the smallest element
// from the unsorted part of the array and places it at the correct position.

/* Pattern
i → current position
     ↓
search remaining array
     ↓
find minimum index
     ↓
swap with i
*  */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 11, 15, 3, 2};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
