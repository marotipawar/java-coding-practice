package com.maroti.classes;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber()
    {
        return this.firstNumber;
    }
    public double getSecondNumber()
    {
        return this.secondNumber=secondNumber;
    }

    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber= firstNumber;
    }

    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }

    public double getAdditionResult()
    {
        return (this.getFirstNumber()+this.getSecondNumber());
    }

    public double getSubtractionResult()
    {
        return(this.getFirstNumber()-this.getSecondNumber());
    }

    public double getMultiplicationResult() {
        if (getFirstNumber() < 0 || getSecondNumber() < 0) {
            return 0;
        } else {

            return (this.getFirstNumber() * this.getSecondNumber());
        }

    }

        public double getDivisionResult()
        {
            if(getSecondNumber()==0)
            {
                return 0;

            }else{

                return(this.getFirstNumber()/this.getSecondNumber());
            }
        }

    }
