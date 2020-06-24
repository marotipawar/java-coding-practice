package com.maroti.loopStatements;

public class PrimeNumber {

    public static void checkPrimeNumberOrNot()
    {
        int count=0;
        for(int i=10; i<50; i++)
        {
            if(isPrime(i)) {
                count++;
                System.out.println("Prime Number : " + i);
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number)
    {
        if(number==1)
        {
          return false;
        }
        for(int i=2; i<=number/2;i++)
        {
            if(number%2==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
       checkPrimeNumberOrNot();
    }
}
