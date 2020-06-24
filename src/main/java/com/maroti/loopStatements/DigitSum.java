package com.maroti.loopStatements;

public class DigitSum {

    public static int digitSum(int number)
    {
        int sum=0;

        if(number<10)
        {
            return -1;
        }
        while(number>0)
        {
            int digit= number%10;
            sum+=digit;

            number/=10;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(digitSum(125)); // output : 8
        System.out.println(digitSum(189)); // output : 18
        System.out.println(digitSum(2020)); // output : 4
        System.out.println(digitSum(95)); // output : 14

    }
}
