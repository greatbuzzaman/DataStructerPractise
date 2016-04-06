package com.examples.problems;

/*Question: Given a sequence of positive integers A and an integer T, return whether there is a continuous sequence of A that sums up to exactly T 
Example 
[23, 5, ,4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20 
[1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8 
[1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7*/

public class ContinuousSeqSum {

    public static boolean findContinuousSum(int[] arr, int nos) {

        // not great O(n^2)
        int sum = 0;
        int j = 0;
        int wr = 0;
        int wl = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && sum < nos) {
                sum += arr[j];
                j++;
            }
            if (sum == nos)
                return true;
            sum -= arr[i];
        }
        return false;
    }

    public static boolean findContiSum(int[] arr, int num) {
        int sum = 0;
        int wr = 0;
        int wl = 0;
        while (wr<arr.length) {
            if (sum < num) {
                sum += arr[wr];
                wr++;
            }
            if (sum == num)
                return true;
            if (sum > num) {
                sum -= arr[wl];
                wl++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 5, 4,7,2,11};
        System.out.println(findContinuousSum(arr, 20));
    }
}
