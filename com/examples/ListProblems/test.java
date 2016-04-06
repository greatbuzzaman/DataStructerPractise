package com.examples.ListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        Integer[][] matrix = new Integer[a.size()][];
        
        System.out.println("a :"+a);
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> row = a.get(i);
            System.out.println("row :"+row+"row size :"+row.size());
            matrix[i] = row.toArray(new Integer[row.size()]);
        }
        System.out.println("aToMAtrix :");
        System.out.println("Before:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("rows:"+rows+" cols:"+cols);
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
        for (int i = 0; i < matrix.length; i++) {
            result.add(new ArrayList<Integer>());
            for (int j = 0; j < matrix[0].length; j++) {
                result.get(i).add( matrix[i][j]);
                
            }
           
        }
        a=result;
        System.out.println("After:");
        System.out.println("Result :"+result);
        System.out.println("a   :"+a);
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,1));
        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(0,0));
        // ArrayList<Integer> row3=new ArrayList<Integer>( Arrays.asList(1, 1));
        // ArrayList<Integer> row4=new ArrayList<Integer>( Arrays.asList(1, 1));
        arr1.add(row1);
        arr1.add(row2);// arr1.add(row3);arr1.add(row4);
        System.out.println("arr ;" +arr1);
        setZeroes(arr1);

    }

}
