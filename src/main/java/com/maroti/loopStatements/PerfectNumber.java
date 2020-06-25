package com.maroti.loopStatements;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number)
    {
        int divisor=0;
        if(number>1)
        {
            for(int i=1; i<number; i++)
            {
                if(number%i==0)
                {
                    divisor+=i;

                }
            }
            if(divisor==number)
                return true;
            else
                return false;
        }else{
            return false;
    }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); //output: true
    }
}
