//Replace 1's with 0's in an matrix.
package com.examples.ListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixZeros {
    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Integer[][] matrix = new Integer[a.size()][];
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> row = a.get(i);
            matrix[i] = row.toArray(new Integer[row.size()]);
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
        
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowzero = new boolean[rows];
        boolean[] colzero = new boolean[cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    rowzero[r] = true;
                    colzero[c] = true;
                }
            }
        }
        for (int r = 0; r < rows; r++) {
            if (rowzero[r]) {
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        for (int c = 0; c < cols; c++) {
            if (colzero[c]) {
                for (int r = 0; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        System.out.println("After:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
       // ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(0, 0));
       // ArrayList<Integer> row2 =new ArrayList<Integer>(Arrays.asList(1, 0));
       ArrayList<Integer> row3=new ArrayList<Integer>( Arrays.asList(1, 1));
        ArrayList<Integer> row4=new ArrayList<Integer>( Arrays.asList(1, 1));
        arr1.add(row3);arr1.add(row4);//arr1.add(row3);arr1.add(row4);
        setZeroes(arr1);

    }

}
