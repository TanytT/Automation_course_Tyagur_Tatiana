package com.company.homeworks.HW02;

import java.util.Random;

public class SolveTheEqual {
    public static void main(String[] args) {
        double a = new Random().nextInt(100);
        double b = new Random().nextInt(100);
        System.out.println(a);
        System.out.println(b);
        double x;
        if(a==0){
            System.out.println("The equal has no solutions: A can`t be zero.");
        }else if(b==0){
            System.out.println("The equal has one solution: x= 0 ");
        }else{
            x= (-b)/a;
            System.out.println("Result:"+x);
        }
    }
}
