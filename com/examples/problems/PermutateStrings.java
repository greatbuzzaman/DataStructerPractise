package com.examples.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Permutate a list of string 
this question is supposed permutate the characters instead of who string, 
as input example {"red", "fox", "super" }, the expected output is 
*/

public class PermutateStrings {
    static int count = 0;

    public static void permutateLstOfStrings(List<String> list, int depth, String permutation) {
        int size = list.size();

        if (depth == size) {
            System.out.println(permutation);
            count++;
        } else {
            String w = list.get(depth);
            for (int i = 0; i < w.length(); i++) {
                permutateLstOfStrings(list, depth + 1, permutation + w.charAt(i));
            }
        }

    }

    public void permutateAllWordsInList(List<String> list) {
        HashMap<String, HashSet<String>> hmap = new HashMap<String, HashSet<String>>();
        HashSet<String> perms = new HashSet<String>();
        for (String word : list) {
            perms = allPermutations(word, "");
            System.out.println("Perms Size" + perms.size());
            if (!hmap.containsKey(word)) {
                hmap.put(word, perms);
            }
        }
        System.out.println("HashMap size :" + hmap.size());
    }

    public HashSet<String> allPermutations(String word, String prefix) {
        int n = word.length();
        HashSet<String> perms = new HashSet<String>();
        if (n == 0) {
            perms.add(prefix);

            // System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                perms.addAll(allPermutations(word.substring(0, i) + word.substring(i + 1, n), prefix + word.charAt(i)));
            }
        }
       // System.out.println(perms);
        return perms;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PermutateStrings ps = new PermutateStrings();
        ps.allPermutations("abt", "");
        /*
         * List<String> words = new ArrayList<String>(); words.add("red"); words.add("fox");
         * ps.permutateAllWordsInList(words);
         */

        /*
         * List<String> list = new ArrayList<String>(); list.add("red"); list.add("fo"); //list.add("super");
         * permutateLstOfStrings(list, 0, "");
         */

        System.out.println("Total count" + count);
    }

    // Permutation of single string //
    /*
     * public void allPermutations(String word, String prefix) { int n = word.length(); if (n == 0) {
     * System.out.println(prefix); count++; } else { for (int i = 0; i < n; i++) { allPermutations(word.substring(0, i)
     * + word.substring(i + 1, n), prefix + word.charAt(i)); } } }
     */
}
