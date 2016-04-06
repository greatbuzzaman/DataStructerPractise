//find k nearest elements to a given nos in an array.
package com.examples.problems;

public class KNearestElemArr {
    public static void findKNearestElem(int[] arr, int k, int num) {
        FindAllMissingEle bs = new FindAllMissingEle();
        int pos = bs.findCrossoverPoint(arr, 0, arr.length - 1, num);
        int l=pos;
        int r= pos+1;
        if(arr[l]==num)l--;
        int count=0;
        while(l >=0 && r<arr.length && count<k){
            if(num-arr[l]>=arr[r]-num)
                System.out.println("ele :"+arr[r++]);
            else
                System.out.println("ele :"+arr[l--]);
            count++;
        }
        while(count<k&&l>=0){
            System.out.println("ele :"+arr[l--]);
            count++;
        }
        while(count<k&& r<arr.length){
            System.out.println("ele :"+arr[r++]);
            count++;
        }
            
        /*System.out.println("pos:"+pos);
        if (pos == arr.length - 1) {
            for (int i = arr.length-k-1; i < arr.length-1; i++) {
                System.out.println(arr[i]);
            }
        }else if(pos==0){
            for (int i = pos+1; i<=pos+k; i++) {
                System.out.println("ele : "+arr[i]);
            }
        }else{
            for (int i= pos/2+1; i<=pos+1+k/2; i++) {
                if(i!=pos)
                    System.out.println("ele : "+arr[i]);
            }
        }*/

    }

    public static void main(String[] args) {
        int[] arr = new int[] {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56 };
        findKNearestElem(arr, 4, 35);  
        System.out.println((9/4)%10);

    }

}
