package com.maroti.statements;

public class AreaCalculator {
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1.0;
        }else{
            return radius*radius*Math.PI;
        }

    }

    public static double area(double x, double y)
    {
        if(x<0 || y<0)
        {
            return -1.0;
        }else{
            return x*y;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(120)); //output : 45238.93421169302
        System.out.println(area(20,20)); //output : 400.0
    }

}
