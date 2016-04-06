// Program for adding 1 to a digit(represented in array)
package com.examples.ListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DigitList {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int len = a.size();
        ArrayList<Integer> result = new ArrayList<Integer>(a);
        Collections.reverse(a);
        Collections.reverse(result);
        int carry = 1;
        for (int i = 0; i < len; i++) {
            if (carry == 0)
                break;
            int dig = a.get(i);
            int num = dig + carry;
            if (num >= 10) {
                carry = num / 10;
                dig = num % 10;
            } else {
                carry = 0;
                dig = num;
            }
            result.set(i, dig);

        } // if 9 9 9
        if (carry != 0) {
            result.add(0, 1);
            System.out.println(result + "in 999");
            return result;
        } // removing leading zeros
        System.out.println("1." + result);
        Collections.reverse(result);
        int index = 0;
        while (index < result.size() && result.get(index) == 0) {
            result.remove(index);
        }
        System.out.println("2." + result);
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer arr[] = { 1, 9, 9, 9, 9 };
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(arr));
        plusOne(arr1);
    }

}
