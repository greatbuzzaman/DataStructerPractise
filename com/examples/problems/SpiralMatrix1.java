package com.examples.problems;

import java.util.ArrayList;

public class SpiralMatrix1 {
    static int[][] spiralMatrix;
    static int[][] spiralMatrix1;
    static int[][] spiralMatrix2;

    public static void spiralMatrix(int num) {
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
        int matrixSize = 2 * num - 1;
        spiralMatrix = new int[matrixSize][matrixSize];
        int r1 = 0, r2 = matrixSize - 1;
        int c1 = 0;
        int c2 = matrixSize - 1;
        while (num > 0) {
            for (int i = c1; i <= c2; i++)
                spiralMatrix[r1][i] = num;
            for (int j = r1 + 1; j <= r2; j++)
                spiralMatrix[j][c2] = num;
            for (int i = c1; i <= c2 - 1; i++)
                spiralMatrix[r2][i] = num;
            for (int j = r1 + 1; j <= r2 - 1; j++)
                spiralMatrix[j][c1] = num;
            c1++;
            c2--;
            r2--;
            r1++;
            num--;
        }
        for (int i = 0; i < spiralMatrix.length; i++) {
            returnList.add(new ArrayList<Integer>());
            for (int j = 0; j < spiralMatrix[0].length; j++) {
                returnList.get(i).add(spiralMatrix[i][j]);
            }
        }
        //System.out.println(returnList);
        print(spiralMatrix.length);

    }

    public static void print(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(" " + spiralMatrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void spiralMatrix1(int start, int end, int num) {
        int matrixSize = 2 * num - 1;
        spiralMatrix1 = new int[matrixSize][matrixSize];
        while (num > 0) {
            for (int i = start; i <= end; i++) {
                spiralMatrix1[start][i] = num;
                spiralMatrix1[end][i] = num;
                spiralMatrix1[i][start] = num;
                spiralMatrix1[i][end] = num;
            }
            start++;
            end--;
            num--;
        }
        
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(" " + spiralMatrix1[i][j]);
            }
            System.out.println("");
        }
    }

    /*
     * n=3 print spiral 1to n^2?like this: [[ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
     */
    public static void spiralMatrix2(int num) {

        ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
        int matrixSize = num;
        int[][] spiralMatrix = new int[matrixSize][matrixSize];
        int currVal = 1;
        int start = 0;
        int end = matrixSize - 1;
        while (currVal <= num * num) {
            for (int i = start; i <= end; i++) {
                spiralMatrix[start][i] = currVal++;
            }

            for (int j = start + 1; j <= end; j++) {
                spiralMatrix[j][end] = currVal++;
            }

            for (int i = end - 1; i >= start; i--) {
                spiralMatrix[end][i] = currVal++;
            }

            for (int j = end - 1; j > start; j--) {
                spiralMatrix[j][start] = currVal++;
            }
            start++;
            end--;
        }
        /*
         * for (int i = 0; i < matrixSize; i++) { for (int j = 0; j < matrixSize; j++) { System.out.print("  " +
         * spiralMatrix[i][j]); } System.out.println(" ");
         */
        // }
        for (int i = 0; i < spiralMatrix.length; i++) {
            returnList.add(new ArrayList<Integer>());
            for (int j = 0; j < spiralMatrix[0].length; j++) {
                returnList.get(i).add(spiralMatrix[i][j]);
            }
        }
        System.out.println(returnList);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        spiralMatrix(7);
        // spiralMatrix1(0,4,3);
        // spiralMatrix2(1);
    }

}
