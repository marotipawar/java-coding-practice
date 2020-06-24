package com.maroti.loopStatements;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if((a>=10 && a<=1000) &&  (a>=10 && a<=1000) && (a>=10 && a<=1000))
        {
            if((a%=10)==(b%=10) || (b%=10)==(c%=10) || (c%=10)==(a%=10))
            {

                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }

    }

    public static boolean isValid(int number)
    {
        if(number>=10 && number<=1000)
        {

            return true;

        }else{

            return false;
        }
    }

    public static int lastDigit(int number)
    {
        if(number>=10 && number<=1000)
        {

            return (number%=10);

        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(12,20,23)); //output: false
    }
}
