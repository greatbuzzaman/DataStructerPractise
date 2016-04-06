package com.examples.problems;

import java.util.HashMap;
import java.util.Map;

public class FibRecursive {
    Map<Integer, Integer> fibMap = new HashMap<Integer, Integer>();
    public int Fibo(int n){
        fibMap.put(0, 1);
        fibMap.put(1, 1);
        if(!fibMap.containsKey(n)){
            fibMap.put(n, Fibo(n-1)+Fibo(n-2));
        }
       return fibMap.get(n);           
    }

    public static void main(String[] args) {
        FibRecursive fr= new FibRecursive();
        System.out.println(fr.Fibo(5));
        System.out.println(fr.Fibo(6));
        
    }

}
