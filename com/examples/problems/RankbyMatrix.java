package com.examples.problems;

import java.util.HashMap;
import java.util.Map;

public class RankbyMatrix {

    static Map<Integer, Integer> factMap = new HashMap<Integer, Integer>();

    public static int findRank(String a) {
        if (a == null || a.length() == 0) {
            return 0;
        }
        a = a.toUpperCase();
        int rank = CountRank(a) + 1;
        return (rank % 1000003);
    }

    private static int CountRank(String inputStr) {
        if (inputStr == null || inputStr.length() == 0) {
            return 0;
        }
        char frstChar = inputStr.charAt(0);
        int count = 0;
        int[] charsOccur = new int[256];
        for (int i = 0; i < inputStr.length(); i++) {
            charsOccur[inputStr.charAt(i)]++ ;
        }
        for (int j = 0; j < charsOccur.length; j++) {
            System.out.println((char)j + " = " + charsOccur[j]);
        }
        
        for (char ch : inputStr.toCharArray()) {
            if (ch < frstChar) {
                count++;
            }
        }
        int wordsCount = count * fact(inputStr.length() - 1);
        String newInputStr = inputStr.substring(1);
        return wordsCount + CountRank(newInputStr);
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
        // long start = System.currentTimeMillis();
        long start = System.currentTimeMillis();
        System.out.println(findRank("baa"));
        long end = System.currentTimeMillis();
        System.out.println("Took:" + (end - start));
    }
}
