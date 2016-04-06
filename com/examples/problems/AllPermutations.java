//Incomplete solution
package com.examples.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllPermutations {
    static Map<Integer, HashSet<String>> lookupMap = new HashMap<Integer, HashSet<String>>();
    public static HashSet<String> findAllCombinations(int[] array, int targetSum) {
        return findCombinations("", array, targetSum);
    }
    public static HashSet<String> findCombinations(String pre, int[] array, int targetSum) {
       
        if (!lookupMap.containsKey(targetSum)){
            Set<String> stringSet = new HashSet<String>();
            if (targetSum == 0) {
                stringSet.add(pre);
            }
            if (targetSum > 0) {
                /*if (lookupMap.containsKey(targetSum)) {
                    stringSet.addAll(lookupMap.get(targetSum));
                } else {*/
                    HashSet<String> stringSubSet = new HashSet<String>() ;
                    for (int num : array) {
                        stringSubSet = findCombinations(pre +" "+String.valueOf(num), array, targetSum - num);
                        stringSet.addAll(stringSubSet);
                    }
                    //lookupMap.put(targetSum,stringSubSet );
                    lookupMap.put(targetSum,stringSubSet );
                }  
        }
       // }
        return lookupMap.get(targetSum);
        //return (HashSet<String>) stringSet;
    }
    
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3};
        int sum = 10;
        HashSet<String> hashset = findAllCombinations(arr, sum);
        System.out.println(hashset);
        System.out.println(hashset.size());
    }
}
