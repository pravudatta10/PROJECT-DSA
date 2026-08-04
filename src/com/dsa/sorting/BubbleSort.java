package com.dsa.sorting;
/*
Bubble Sort is one of the simplest sorting algorithms.
It works by repeatedly stepping through a list, comparing adjacent elements, and swapping them if they are in the wrong order.
This process repeats until the entire list is sorted.
*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {31, 5, 7, 45, 60, 4};

        new BubbleSort().bubbleSort(arr);
    }

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
