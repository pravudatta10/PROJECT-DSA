package com.dsa.sorting;

import java.util.Arrays;

/**
 * A divide-and-conquer sorting algorithm that selects a pivot,
 * partitions the array around it, and recursively sorts the left and right partitions.
 * Sorts an array using the Quick Sort algorithm.
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Recursively sorts the array between low and high indexes.
     */
    public static void quickSort(int[] arr, int low, int high) {

        // Base case: one or zero elements are already sorted.
        if (low >= high) {
            return;
        }

        // Find the correct position of the pivot.
        int pivotIndex = partition(arr, low, high);

        // Sort left and right parts.
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    /**
     * Partitions the array around a pivot.
     */
    private static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot.
        int pivot = arr[high];

        // Points to the last element smaller than the pivot.
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place pivot in its correct position.
        swap(arr, i + 1, high);

        return i + 1;
    }

    /**
     * Swaps two elements in the array.
     */
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/*
Time Complexity:
Best:    O(n log n)
Average: O(n log n)
Worst:   O(n²)

Space Complexity:
Average recursion: O(log n)
Worst recursion:   O(n)

 Pattern
 ----------
Choose Pivot
      ↓
Partition
      ↓
Pivot reaches correct position
      ↓
Recursively sort left and right
* */