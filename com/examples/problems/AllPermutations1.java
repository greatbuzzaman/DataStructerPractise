package com.examples.problems;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllPermutations1 {

    static Map<Integer, Set<String>> lookupMap = new HashMap<Integer, Set<String>>();

    public static List<Integer> findAllCombinations(int[] array, int targetSum) {
        // return findpermutations("", array, targetSum);

        return findCombinations(array, targetSum, new ArrayList<Integer>(), 0);
    }

    public static List<Integer> findCombinations(int[] array, int targetSum, List<Integer> combinations, int stIdx) {
        // List<Integer> combinations = new ArrayList<Integer>();
        if (targetSum == 0) {
            return combinations;
        }
        int i = stIdx;
        while (stIdx < array.length && array[stIdx] > targetSum) {
            stIdx++;
        }
        while (stIdx < array.length && array[stIdx] <= targetSum) {
            combinations.add(array[stIdx]);
            findCombinations(array, targetSum - array[stIdx], combinations, stIdx + 1);
            // combinations.remove(array[stIdx]);
            stIdx++;
        }
        return combinations;
    }

    public static Set<String> findpermutations(String pre, int[] array, int targetSum) {
        Set<String> stringSet = new LinkedHashSet<String>();
        Arrays.sort(array);
        if (targetSum == 0) {
            stringSet.add(pre);
            return (Set<String>) stringSet;
        }
        if (targetSum > 0) {
            Set<String> stringSubSet = new LinkedHashSet<String>();
            for (int num : array) {
                stringSubSet = findpermutations(pre + " " + String.valueOf(num), array, targetSum - num);
                for (String string : stringSubSet) {
                    stringSet.add(string);
                }
                // stringSet.addAll(stringSubSet);
            }
        }
        return (Set<String>) stringSet;
    }

   
    public static void main(String[] args) {
        // int[] arr = { 2, 4,5};
        int[] arr = { 1, 3, 2 };
        int sum = 5;
        List<Integer> list = findAllCombinations(arr, sum);
        System.out.println(list);
        for (Integer string : list) {

        }
        System.out.println(list.size());
    }
}
