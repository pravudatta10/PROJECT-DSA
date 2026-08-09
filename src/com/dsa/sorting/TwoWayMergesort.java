package com.dsa.sorting;

import java.util.Arrays;

/*
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]

Output:
[1, 2, 3, 4, 5, 6, 7, 8]
 */
public class TwoWayMergesort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8,9};
        twoWayMergesort(arr1, arr2);
    }

    public static void twoWayMergesort(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] resultArray = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                resultArray[k++] = arr2[j++];
            } else {
                resultArray[k++] = arr1[i++];
            }
        }
        while (i < arr1.length) {
            resultArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            resultArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
