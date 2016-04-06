//Find all missing elements in an array
package com.examples.problems;

import java.util.ArrayList;

public class FindAllMissingEle {
    public static int count = 0;
    public static int pos = 0;
    public static boolean flag = false;

    public int findCrossoverPoint(int[] arr, int left, int right, int num) {
        if (arr[right] <= num)
            return right;
        if (arr[left] > num)
            return left;
        int mid = left + (right - left) / 2;
        if (arr[mid] == num) {
            return mid;
        }
        if (arr[mid] < num) 
            return findCrossoverPoint(arr, mid + 1, right, num);
        return findCrossoverPoint(arr, left, mid - 1, num);
    }

    public static int findMissingElement(int[] arr) {
        int low = 0;
        ArrayList<Integer> missEle = new ArrayList<Integer>();
        int right = arr.length - 1;
        while (low <= right) {
            int mid = low + (right - low) / 2;
            if (arr[mid] != mid) {
                if (mid == 0 || arr[mid - 1] == mid - 1) {
                    System.out.println(mid);
                }
                right = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }

    public static void findAllMissingElement(int[] arr, int pos) {

        if (pos == arr.length - 1) {
            return;
        }
        for (; pos < arr[arr.length - 1]; pos++) {
            if ((arr[pos] - count) != pos) {
                System.out.println(pos + count);
                flag = true;
                count++;
                break;
            }
        }
        if (flag) {
            flag = false;
            findAllMissingElement(arr, pos);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[] { 0, 1, 2, 3, 5, 6, 8, 10, 11, 13 };
        findAllMissingElement(arr, pos);

        /*
         * ArrayList<Integer> missingnos= new ArrayList<Integer>(); missingnos.add(findMissingElement(arr));
         * System.out.println(missingnos);
         */
    }

}
