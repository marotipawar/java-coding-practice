package com.maroti.loopStatements;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b)
    {
        int greatestNumber=0;

        if(a<10 || b<10)
        {
            return -1;

        }else if(a>=b){

            for(int i=2; i<=a; i++)
            {
                if((a%i==0) && (b%i==0))
                {

                    if(greatestNumber<i)
                    {
                        greatestNumber=i;
                    }
                }
            }

        }else if(b>=a){
            for(int i=2; i<=b; i++)
            {
                if((a%i==0) && (b%i==0))
                {
                    if(greatestNumber<i)
                    {
                        greatestNumber=i;
                    }
                }
            }

        }
        return greatestNumber;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30)); // output : 6
    }
}
