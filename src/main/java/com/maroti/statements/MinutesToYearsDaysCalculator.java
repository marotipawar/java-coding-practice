package com.maroti.statements;

public class MinutesToYearsDaysCalculator {
    public static void printYearAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }else{
            minutes+=minutes%60;
            long hour=minutes/60;
            long day=hour/24;
            long year= day/365;
            long remDays = day%365;

            System.out.println("Total Hours :" +hour +" Day : "+day);
            System.out.println("Minutes : "+minutes+" Total Hours :" +hour +" Year : "+year+ " Days : "+remDays);
        }
    }

    public static void main(String[] args) {
        printYearAndDays(561600); //output : Minutes : 561600 Total Hours :9360 Year : 1 Days : 25
    }
}
