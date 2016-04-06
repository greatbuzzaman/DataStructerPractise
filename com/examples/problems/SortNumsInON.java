package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortNumsInON {

    public static void countsort(int[] arr, int n, int digit) {
        int[] output = new int[arr.length];
        int i;
        int[] count = new int[n];

        for (i = 0; i < n; i++)
            count[(arr[i] / digit) % n]++;
        for (i = 1; i < n; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / digit) % n] - 1] = arr[i];
            count[(arr[i] / digit) % n]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void sort(int[] arr, int n) {
        countsort(arr, n, 1);
        countsort(arr, n, n);
    }

    public static void main(String[] args) {
        int[] arr = { 40, 12, 45, 32, 33, 1, 22 };
        int n = 7;
        System.out.println("Given array is ");
        printArr(arr, n);
        sort(arr, n);
        System.out.println("\nSorted array is ");
        printArr(arr, n);
    }

    private static void printArr(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}
