package com.company.homeworks.HW07;

public class FractionNumbers {

    private int numerator ;
    private int denominator;

    public FractionNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        if(denominator!=0) {
            this.denominator = denominator;
        }else {
            this.denominator = 1;
            System.out.println("Denominator can not be 0, so it will be 1.");
        }
    }
    public FractionNumbers plus(FractionNumbers fNum){
        int resNumerator =fNum.getNumerator()*this.denominator + this.numerator*fNum.getDenominator();
        int resDenominator = fNum.getDenominator()*this.denominator;
        return new FractionNumbers(resNumerator,resDenominator);
    }
    public FractionNumbers minus(FractionNumbers fNum){
        int resNumerator = fNum.getNumerator()*this.denominator - this.numerator*fNum.getDenominator();
        int resDenominator = fNum.getDenominator()*this.denominator;
        return new FractionNumbers(resNumerator,resDenominator);
    }
    public FractionNumbers multiply(FractionNumbers fNum){
        int resNumerator = fNum.getNumerator()*this.numerator;
        int resDenominator = fNum.getDenominator()*this.denominator;
        return new FractionNumbers(resNumerator,resDenominator);
    }
    public FractionNumbers devide(FractionNumbers fNum){
        int resNumerator = this.numerator*fNum.getDenominator();
        int resDenominator = fNum.getNumerator()*this.denominator;
        return new FractionNumbers(resNumerator,resDenominator);
    }
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    @Override
    public String toString() {
        return  numerator +
                "/" + denominator;
    }
}
