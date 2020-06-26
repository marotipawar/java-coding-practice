package com.maroti.loopStatements;

import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int number=0;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            boolean isInt =sc.hasNextInt();

            if(isInt)
            {
                number=sc.nextInt();
                if(number>max)
                {
                    max=number;
                }

                if(number<min)
                {
                    min=number;
                }
            }else{
                System.out.println("Invalid Number");
                break;
            }
        }

        System.out.println("Min= "+min+" Max= "+max);


    }
}
