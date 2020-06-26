package com.maroti.loopStatements;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int avg=0;
        int count=0;
        int numbers=0;


        while(true)
        {

            System.out.println("Enter the Number : ");
            boolean isInt=sc.hasNextInt();


            if(isInt)
            {

                 numbers= sc.nextInt();

                sum+=numbers;
                count++;

            }else{

                if(sum<=0)
                {
                    System.out.println("SUM = "+sum+" AVG = "+avg);
                }
                break;
            }

            sc.nextLine();

        }
        avg=Math.round(sum/count);

        System.out.println("SUM = "+sum+" AVG = "+avg);
        System.out.println(count);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
