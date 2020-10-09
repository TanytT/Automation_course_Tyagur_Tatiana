package com.company.lectures.lecture02;

public class Task4 {
    public static void main(String[] args) {
        double a =20;
        double b =60;
        double c=0;
        c=b;
        b=a;
        a=c;
        System.out.println("A"+a);
        System.out.println("B"+b);
        /////////////////////////////////////////
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A" +a);
        System.out.println("B" +b);


    }
}
