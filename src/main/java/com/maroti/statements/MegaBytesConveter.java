package com.maroti.statements;

public class MegaBytesConveter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes<0)
        {
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes/1024;
            int kilobytes = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kilobytes+" KB");
        }
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(120541); // output : 120541 KB = 117 MB and 733 KB
    }

}
