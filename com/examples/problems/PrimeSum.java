package com.examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class PrimeSum {
    public static ArrayList<Integer> primeSum(int a) {
        // Generate isPrime List less equal than N
        Vector<Boolean> isPrime = new Vector<Boolean>(Arrays.asList(new Boolean[a + 1]));
        Collections.fill(isPrime, Boolean.TRUE);
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int i = 2; i <= a; i++) {
            if (!isPrime.get(i))
                continue;
            if (i > a / i)
                break;
            for (int j = i * i; j <= a; j += i)
                isPrime.set(j, false);
        }
        for (int i = 2; i <= a; ++i) {
            if (isPrime.get(i) && isPrime.get(a - i)) {
                ArrayList<Integer> ans = new ArrayList<Integer>();
                ans.add(i);
                ans.add(a - i);
                return ans;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        return ans;

    }

    /*
     * public static ArrayList<Integer> findSums(int a) { if (a % 2 != 0) { ArrayList<Integer> ans = new
     * ArrayList<Integer>(); // System.out.println("Not Even"); return ans; } if (a <= 2) { // System.out.println(
     * "Less than 2"); ArrayList<Integer> ans = new ArrayList<Integer>(); return ans; } for (int i = 3; i < a / 2; i++)
     * { if (isPrime(i) && isPrime(a - i)) { // System.out.println("Prime Numbers are " + i + " " + (x - i));
     * ArrayList<Integer> ans = new ArrayList<Integer>(); ans.add(i); ans.add(a - i); return ans; } } ArrayList<Integer>
     * ans = new ArrayList<Integer>(); return ans;
     * 
     * }
     * 
     * public static boolean isPrime(int x) { for (int i = 2; i < x / 2; i++) { if (x % i == 0) { return false; } }
     * return true; }
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> res = new ArrayList<Integer>();
        res = primeSum(4);
        System.out.println("result :" + res);

    }

}
