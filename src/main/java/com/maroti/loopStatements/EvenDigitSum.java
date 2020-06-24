package com.maroti.loopStatements;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        int temp=0;
        if(number>0)
        {
            while(number>0)
            {

                int lastDigit=number%10;
                temp=lastDigit;
                //System.out.println(temp);
                if(temp%2==0)
                {
                    sum+=temp;
                }
                number/=10;
             }


        }else{
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        //getEvenDigitSum(251);
    }

}
