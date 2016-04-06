package com.examples.problems;

public class PartitionProblem {

    public static void main(String[] args) {
        int[] arr = { 4, 6, 4, 14 };

    }

    private boolean findPartition(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        if (sum % 2 != 0)
            return false;

        boolean[][] parts = new boolean[sum / 2 + 1][n + 1];
        for (int i = 0; i <= n; i++)
            parts[0][i] = true;
        for (int j = 1; j <= sum/2; j++)
            parts[j][0] = false;

        return false;

    }

}
