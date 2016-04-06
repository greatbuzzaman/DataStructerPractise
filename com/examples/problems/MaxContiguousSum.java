//Max contiguous sum in an array
package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MaxContiguousSum {

    // to print the array
    public static void maxContSuma(int[] arr) {
        int maxSumSoFar = 0;
        int maxSumHere = 0;
        int start = 0, end = 0, currindx = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSumHere = maxSumHere + arr[i];
            if (maxSumHere < 0) {
                maxSumHere = 0;
                currindx = i + 1;
            }
            if (maxSumSoFar < maxSumHere) {
                maxSumSoFar = maxSumHere;
                start = currindx;
                end = i;
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            al.add(arr[i]);
        }
        System.out.println("Max Sum :"+maxSumSoFar+" MaxSumSubArray :"+al);
    }

    public static int maxContSum(List<Integer> arr) {
        int maxSumSoFar = 0;
        int maxSumHere = 0;

        for (Integer val : arr) {
            maxSumHere = maxSumHere + val;
            if (maxSumHere < 0)
                maxSumHere = 0;
            if (maxSumSoFar < maxSumHere) {
                maxSumSoFar = maxSumHere;
            }
        }

        if (maxSumSoFar == 0) {

            int maxSum = arr.get(0);
            for (Integer val : arr) {
                if (maxSum < val)
                    maxSum = val;
                System.out.println(maxSum);
            }
            return maxSum;

        }
        System.out.println("MAx Sum Till Now :" + maxSumSoFar);
        return maxSumSoFar;

    }

    // interview bit question
    public int maxSubArray(final List<Integer> a) {
        int maxSumSoFar = 0;
        int maxSumHere = 0;
        for (Integer val : a) {
            maxSumHere = maxSumHere + val;
            if (maxSumHere < 0)
                maxSumHere = 0;
            // maxSumSoFar = maxSumHere;
            if (maxSumSoFar < maxSumHere)
                maxSumSoFar = maxSumHere;
        }
        if (maxSumSoFar == 0) {
            int maxSum = a.get(0);
            for (Integer val : a) {
                if (maxSum < val)
                    maxSum = val;
                System.out.println(maxSum);
            }
            return maxSum;
        }
        // System.out.println("MAx Sum Till Now :" + maxSumSoFar);
        return maxSumSoFar;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a1 = { -2, 1, -3, 4, -1, 2, 1, -4, 5  };
        Integer arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        List<Integer> arr1 = Arrays.asList(arr);
        maxContSuma(a1);
        // int a = maxContSum(arr1);
        // System.out.println("MAx Sum Till Now :" + a);
    }

}
