package com.examples.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Rank {
    static Map<Integer, Integer> factMap = new HashMap<Integer, Integer>();

    public static int findRank(String a) {
        if (a == null || a.length() == 0) {
            return 0;
        }
        a = a.toUpperCase();
        int rank= CountRank(a) + 1;
        return (rank% 1000003);
    }

    private static int CountRank(String inputStr) {
        if (inputStr == null || inputStr.length() == 0) {
            return 0;
        }
        char frstChar=inputStr.charAt(0);
        int count=0;
       
        for (char ch : inputStr.toCharArray()) {
            if (ch < frstChar) {
                count++;
            }
        }
        int wordsCount=count*fact(inputStr.length()-1);
        String newInputStr=inputStr.substring(1);
        return wordsCount+CountRank(newInputStr);
    }

    public static int fact(int n) {
        factMap.put(0, 1);
        factMap.put(1, 1);
        if (!factMap.containsKey(n)) {
            factMap.put(n, fact(n - 1) * n);
        }
        return factMap.get(n);
    }

    public static void main(String[] args) {
        
        System.out.println("Fact is:" + fact(11) * 2);
        int pos;
        // System.out.println(findRank("DTNGJPURFHYEW"));
        //long start = System.currentTimeMillis();
        System.out.println(findAllPermutations("baa"));
        long start = System.currentTimeMillis();
        System.out.println(findRank("baa"));
        long end = System.currentTimeMillis();
        System.out.println("Took:" + (end - start));
    }
    
    
    
    
    
    
    
    

    // find all permutations of the string and save it.
    public static int findAllPermutations(String a) {
        int pos;
        ArrayList<String> perms = new ArrayList<String>();
        perms = allPermutations(a, "");
        Collections.sort(perms);
        System.out.println(perms);
        HashSet<String> all=new HashSet<String>() ;
        all.addAll(perms);
        System.out.println(all);
        
        if (perms.contains(a)) {
            pos = perms.indexOf(a);
            return pos + 1;
        }
        return 1000003;
    }

    public static ArrayList<String> allPermutations(String word, String prefix) {
        int n = word.length();
        ArrayList<String> perms = new ArrayList<String>();
        if (n == 0) {
            perms.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                perms.addAll(allPermutations(word.substring(0, i) + word.substring(i + 1, n), prefix + word.charAt(i)));
            }
        }
        return perms;
    }
}
