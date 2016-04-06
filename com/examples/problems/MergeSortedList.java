//Merge Sorted List
package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeSortedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0, j = 0;
        List<Integer> finalList = new ArrayList<Integer>();
        List<Integer> arrLst1 = new ArrayList<Integer>(Arrays.asList(1, 4, 7, 9,11,20,21));
        List<Integer> arrLst2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 8, 10));
        /*
         * Iterator<Integer> iter1=arrLst1.iterator(); Iterator<Integer> iter2=arrLst2.iterator();
         */
        while (i < arrLst1.size() && j < arrLst2.size()) {
            if (arrLst1.get(i) < arrLst2.get(j)) {
                finalList.add(arrLst1.get(i));
                i++;
            } else {
                finalList.add(arrLst2.get(j));
                j++;
            }
        }
        System.out.println(i+"->i & j->" +  j);
        System.out.println(finalList);
        while (i < arrLst1.size()){
            finalList.add(arrLst1.get(i));
            i++;}
        while (j < arrLst2.size()){
            finalList.add(arrLst2.get(j));
            j++;}

        System.out.println(finalList);
    }

}
