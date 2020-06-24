package com.maroti.loopStatements;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second)
    {
        if((first>=10 && first<=99)&&(second>=10 && second<=99))
        {
            int tempF1=first%10;
            first/=10;
            int tempS1=second%10;
            second/=10;
            int tempF2=first%10;
            first/=10;
            int tempS2=second%10;
            second/=10;

            if(tempF1==tempS1 || tempF1==tempS2 || tempS1==tempF1 || tempS2==tempF2)
            {
                return true;
            }else{
                return false;
            }


        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 25)); //output: false
    }
}
