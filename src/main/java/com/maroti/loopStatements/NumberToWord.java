package com.maroti.loopStatements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class NumberToWord {

    public static int getDigitCount(int number)
    {
        int count =0;
        int temp=number;
        if(number>=0)
        {
            while(number>0)
            {
                count++;
                number/=10;
            }
            if(temp==0)
            {
                count=1;
            }

        }else{
            return -1;
        }
        return count;
    }


    public static int getReverseDigit(int number)
    {
        int reverse=0;


            while(number>0 || number<0)
            {
                int digit = number%10;
                reverse=(reverse*10)+digit;
                number/=10;
            }
            return reverse;


    }

    public static void numberToWord(int number)
    {
        int num= getReverseDigit(number);
        int dRCount=getDigitCount(num);
        int dOCount=getDigitCount(number);


        if(num>=0)
        {

            for(int i=num%10; (i<=num); num/=10)
            {

                switch (i)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }

                if(num<=0)
                {
                    break;
                }
                if(dRCount<dRCount)
                {
                    System.out.println("Zero");
                    System.out.println("Zero");
                }
            }


        }else{
            System.out.println("Invalid Value");
        }
    }


    public static void main(String[] args) {

        System.out.println(getReverseDigit(0));
        System.out.println(getDigitCount(0));
        numberToWord(11);

    }
}
