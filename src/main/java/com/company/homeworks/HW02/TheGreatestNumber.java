package com.company.homeworks.HW02;

import java.util.Random;

public class TheGreatestNumber {
    public static void main(String[] args) {
        int num1 = new Random().nextInt(120);
        int num2 = new Random().nextInt(120);
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        if (num1>num2){
            System.out.println("The number 1 has the greatest value " + num1);
        }else if(num1==num2){
            System.out.println("The numbers are equal: " +num1+ " = "+num2);
        }else {
            System.out.println("The number 2 has the greatest value " + num2);
        }
    }
}
