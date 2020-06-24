package com.maroti.loopStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum=0;
        int temp=number;
        if(number>0 || number>=0)
        {
            int firstNumber = 0;
            int lastNumber = 0;


            while(number>=10)
            {
                number/=10;
             }

            firstNumber=number;
            lastNumber=temp%10;
            sum=firstNumber+lastNumber;

        }else{

            return -1;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }
}
