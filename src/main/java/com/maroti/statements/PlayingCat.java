package com.maroti.statements;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if(summer)
        {
            if((temperature>=25 && temperature<=35) || (temperature>=25 && temperature<=45))
            {
                return true;
            }else{
                return false;
            }
        }else if((temperature>=25 && temperature<=35)){

            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10)); //output : false
        System.out.println(isCatPlaying(false, 35)); // output : true
        System.out.println(isCatPlaying(true, 25)); //output : true
        System.out.println(isCatPlaying(false, 20)); // output : false
    }
}
