package com.examples.problems;

public class Palindrome {
    
        public static boolean isPalindrome(int x) {
            //negative numbers are not palindrome
                    if (x < 0)
                            return false;
     
                    // initialize how many zeros
                    int div = 1;
                    while (x / div >= 10) {
                            div *= 10;
                    }
                    while (x != 0) {
                        System.out.println("Before x:"+x+" div:"+div);
                            int left = x / div;
                            int right = x % 10;
                            System.out.println("After left : "+left+" right : "+right);
                            if (left != right)
                                    return false;
     
                            x = (x % div) / 10;
                            div /= 100;
                            System.out.println("After x:"+x+" div:"+div);
                    }
                    return true;
        }
  
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(isPalindrome(12121));
    }

}
