package com.examples.problems;

import java.util.HashMap;
import java.util.Map;

public class Factrecursive {
    Map<Integer, Integer> fibMap = new HashMap<Integer, Integer>();

    public int fact(int n){
        fibMap.put(0, 1);
        fibMap.put(1, 1);
        if(!fibMap.containsKey(n)){
            fibMap.put(n, fact(n-1)*n);
        }
       return fibMap.get(n);       
    }

    public static void main(String[] args) {
        Factrecursive fr = new Factrecursive();
        System.out.println(fr.fact(5));
        System.out.println(fr.fact(6));
    }

}
