package com.maroti.statements;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        if((int)(a*1000) == (int)(b*1000))
        {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1576, 3.1575)); // output: true
        System.out.println(areEqualByThreeDecimalPlaces(3.1576, 3.1675)); // output: false

    }
}
