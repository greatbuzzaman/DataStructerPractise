//find the position to insert new element in sorted array
package com.examples.ListProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertPos {

    public static int searchInsert(ArrayList<Integer> a, int target) {
        Integer[] A = a.toArray(new Integer[a.size()]);
        if(A==null||A.length==0)
            return 0;
 
        return searchInsert(A,target,0,A.length-1);
    }
 
    public static int searchInsert(Integer[] a, int target, int start, int end){
        int mid=(start+end)/2;
 
        if(target==a[mid]) 
            return mid;
        else if(target<a[mid]) 
            return start<mid?searchInsert(a,target,start,mid-1):start;
        else 
            return end>mid?searchInsert(a,target,mid+1,end):(end+1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer arr[] = {1,3,5,6};
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(arr));
        int a = searchInsert(arr1,4);
        System.out.println("nn "+a);

    }

}
