package com.company.homeworks.HW02;

import java.util.Random;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        System.out.println(number);
        if (number%2==1){
            System.out.println("Odd Number");
        }else {
            System.out.println("Even Number");
        }
        System.out.println("BYE");
    }
}
