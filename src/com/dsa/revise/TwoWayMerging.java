package com.dsa.revise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoWayMerging {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        twoWayMerging(arr1, arr2);
    }

    public static void twoWayMerging(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                result[k++] = arr2[j++];
            } else {
                result[k++] = arr1[i++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(result));
    }
}
