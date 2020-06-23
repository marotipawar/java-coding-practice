package com.maroti.statements;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c)
    {
        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19) )
        {
            return true;

        }else{
            return false;
        }
    }
    public static boolean isTeen(int a)
    {
        if(a<=19 && a>=13)
        {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(hasTeen(33,12,22)); //output: false
        System.out.println(hasTeen(10,18,8)); //output: true
        System.out.println(isTeen(14)); //output : true
        System.out.println(isTeen(20)); //output : false
    }
}
