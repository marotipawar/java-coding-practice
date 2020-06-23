package com.maroti.statements;

public class SecondMinutes {

    public static String getDuration(long minutes, long seconds)
    {
        if((seconds<0) || (minutes<0) || (seconds>59))
        {
         return "Invalid Value";

        }

            long hour = minutes/60;
            long remainingMinute = minutes%60;
            return "Hour : "+hour+" Minute : "+remainingMinute+"Second : "+seconds;


    }

    public static void main(String[] args) {
        System.out.println(getDuration(120, 40));
    }

}
