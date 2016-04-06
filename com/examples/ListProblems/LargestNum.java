//Find the largest number to be form by nos is an array.
package com.examples.ListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNum {
    public static String largestNumber(final List<Integer> a) {
        String str[]= new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            str[i]=String.valueOf(a.get(i));
            
        }
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                String leftRight = s1+s2;
                String rightLeft = s2+s1;
                return -leftRight.compareTo(rightLeft);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s: str){
            System.out.print(s);
            sb.append(s);
        }
        while(sb.charAt(0)=='0' && sb.length()>1){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //output: 9534330
        Integer arr[] = {3, 30, 34, 5, 9 };
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(arr));
        largestNumber(arr1);
    }

}
