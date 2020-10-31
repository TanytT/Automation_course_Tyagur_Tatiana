package com.company.homeworks.HW07;

public class NumbersOperations {

    public static void main(String[] args) {
        FractionNumbers frN1 = new FractionNumbers(1,3);
        FractionNumbers frN2 = new FractionNumbers(1,2);
        System.out.println(frN1.plus(frN2));
        System.out.println(frN1.minus(frN2));
        System.out.println(frN1.multiply(frN2));
        System.out.println(frN1.devide(frN2));
    }

}
