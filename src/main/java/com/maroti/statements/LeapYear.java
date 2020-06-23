package com.maroti.statements;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year>=1 && year<=9999)
        {
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        return true;
                    }else{
                        return false;
                    }
                }else {
                    return true;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000)); // output : true
        System.out.println(isLeapYear(2015)); // output : false
        System.out.println(isLeapYear(2020)); // output : true
        System.out.println(isLeapYear(2400)); // output : true
    }
}
