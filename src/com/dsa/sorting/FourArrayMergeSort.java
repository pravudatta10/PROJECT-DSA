package com.dsa.sorting;

import java.util.Arrays;

public class FourArrayMergeSort {
    public static void main(String[] args) {
        int[] arrA = {1, 5, 9};
        int[] arrB = {2, 4, 10};
        int[] arrC = {3, 6, 8};
        int[] arrD = {0, 7, 11};

        int[][] arrays = {arrA, arrB, arrC, arrD};
        int[] results = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            results = twoArrayMergeLogic(results, arrays[i]);
        }
        System.out.println(Arrays.toString(results));
    }

    public static int[] twoArrayMergeLogic(int[] arr1, int[] arr2) {
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
        return resultArray;
    }

}
