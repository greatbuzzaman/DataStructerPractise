//Count nos 0's in an array
package com.examples.problems;

public class CountZeros {
    
    public static int firstZero(int[] arr,int low, int high){
        if(high>=low){
            int mid = low +(high-low)/2;
            if (( mid == 0 || arr[mid-1] == 1) && arr[mid] == 0)
                return mid;
            if (arr[mid] == 1)  // If mid element is not 0
                return firstZero(arr, (mid + 1), high);
            else  // If mid element is 0, but not first 0
                return firstZero(arr, low, (mid -1));
        }
        return -1;
        }
        
    static int countZeroes(int arr[], int lngth)
    {
        // Find index of first zero in given array
        int first = firstZero(arr, 0, lngth-1);
     
        // If 0 is not present at all, return 0
        if (first == -1)
            return 0;
     
        return (lngth - first);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] =   {1, 1, 1, 0, 0, 0, 0};
        System.out.println("Nos of zeros :"+countZeroes(arr,arr.length));
    }

}
