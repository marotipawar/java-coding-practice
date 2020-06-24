package com.maroti.loopStatements;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year)
    {
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

                }else{
                    return true;
                }
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year)
    {
        int days = 0;

        if((month<1 || month>12) || (year<1 || year>9999))
        {
            return -1;

        }else if(isLeapYear(year))
        {
            switch(month)
            {
                case 1 : days=31; break;
                case 2 : days=29;break;
                case 3 : days=31;break;
                case 4 : days=30;break;
                case 5 : days=31;break;
                case 6 : days=30;break;
                case 7 : days=31;break;
                case 8 : days=31;break;
                case 9 : days=30;break;
                case 10 : days=31;break;
                case 11 : days=30;break;
                case 12 : days=31;break;
            }

        }else{

            switch(month)
            {
                case 1 : days=31; break;
                case 2 : days=28;break;
                case 3 : days=31;break;
                case 4 : days=30;break;
                case 5 : days=31;break;
                case 6 : days=30;break;
                case 7 : days=31;break;
                case 8 : days=30;break;
                case 9 : days=31;break;
                case 10 : days=31;break;
                case 11 : days=30;break;
                case 12 : days=31;break;
            }
        }

        return days;
    }

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020)); // output: 31
        System.out.println(getDaysInMonth(2, 2020)); // output: 29
        System.out.println(getDaysInMonth(8, 2018)); // output: 30
        System.out.println(getDaysInMonth(2, 2019)); // output: 28
    }
}
