package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllCombinations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 3, 2 };
        int sum = 5;
        List<Integer> list = findAllCombinations(arr, sum);
        System.out.println(list);
        System.out.println(list.size());
    }

    private static List<Integer> findAllCombinations(int[] arr, int targetSum) {
        // TODO Auto-generated method stub
         return findCombinations(arr, targetSum, 0);
    }

    private static List<Integer> findCombinations(int[] arr, int targetSum, int stIdx) {
        // TODO Auto-generated method stub
        Arrays.sort(arr);
        List<Integer> combinations = new ArrayList<Integer>();
        if (targetSum==0) 
            return combinations;
        while (stIdx < arr.length && arr[stIdx] > targetSum) {
            stIdx++;
        }
        while (stIdx < arr.length && arr[stIdx] <= targetSum) {
            //List<Integer> combinations = new ArrayList<Integer>();
            combinations.add(arr[stIdx]);
            findCombinations(arr, targetSum - arr[stIdx],(stIdx + 1));
            //combinations.remove(arr[stIdx]);
            stIdx++;
        }
        return combinations;
    }

}
