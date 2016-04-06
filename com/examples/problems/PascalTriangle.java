package com.examples.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class PascalTriangle {

    private static ArrayList<Integer> getAL() {
        return new ArrayList<Integer>() {
            @Override
            public String toString() {
                return super.toString().replace(",", "").replace("]", "]");
            }
        };
    }

    public static ArrayList<Integer> generate(int a) {
        ArrayList<ArrayList<Integer>> pascTrngl = new ArrayList<ArrayList<Integer>>() {
            @Override
            public String toString() {
                return super.toString().replace("[[", "[").replace("]]", "]").replace(",", "");
            }
        };

        if (a == 0) {
            ArrayList<Integer> curr = getAL();
            curr.add(1);
            pascTrngl.add(0, curr);
            return pascTrngl.get(0);
        }
        for (int i = 0; i < a + 1; i++) {
            ArrayList<Integer> currRow = getAL();
            // ArrayList<Integer> currRow = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    currRow.add(1);
                else if (j < i) {
                    int thisNum = pascTrngl.get(i - 1).get(j - 1) + pascTrngl.get(i - 1).get(j);
                    currRow.add(thisNum);
                } else if (j == i)
                    currRow.add(1);
            }
            pascTrngl.add(currRow);
        }
        for (ArrayList<Integer> row : pascTrngl) {
            System.out.println(row);
            
        }
        
        //System.out.println(pascTrngl);
        return pascTrngl.get(a);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> Row = new ArrayList<Integer>();
        generate(8);
       // System.out.println(generate(8));
    }

}
