package com.maroti.practiceArray;

import java.util.Scanner;

public class FindMinValue {

    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Enter Size of Array : ");
        int[] numbers=getIntegers(sc.nextInt());
        System.out.println("Minimum Number is : "+min(numbers));
    }

    private static int[] getIntegers(int size)
    {
        int[] numbers = new int[size];

        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter the Numbers");
            numbers[i]=sc.nextInt();
            sc.nextLine();
        }
        return numbers;
    }

    private static int min(int[] numbers)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int number = numbers[i];
            if(number<min)
            {
                min=number;
            }
        }
        return min;
    }
}
