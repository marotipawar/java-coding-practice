package com.maroti.loopStatements;

public class NumberPalindrome {

    public static boolean isPalindrome(int number)
    {
        int reverse =0;
        int temp=number;

        while(number>0)
        {
            int lastDigit = number%10;
            reverse=(reverse*10)+lastDigit;
            System.out.println(reverse);
            number/=10;

        }
        if(temp==reverse)
        {
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println( isPalindrome(12321));

    }
}
