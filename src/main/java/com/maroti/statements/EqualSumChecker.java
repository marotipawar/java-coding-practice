package com.maroti.statements;

/* * * * * * * * * * * * * * *
*                            *
*  author : Maroti Pawar     *
*                            *
* * * * * * * * * * * * * *  */

public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c)
    {
        if((a+b)==c)
        {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(hasEqualSum(11,20, 31)); //output: true
        System.out.println(hasEqualSum(11,10, 31)); //output: false

    }
}
