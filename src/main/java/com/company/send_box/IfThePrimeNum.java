package com.company.send_box;

import java.util.Random;

public class IfThePrimeNum {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        boolean flag=true;
        System.out.println(num);
        for (int i = 2; i <num; i++) {
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if((flag)&&(num>1)){
            System.out.println("It is a prime number.");
        }else{
            System.out.println("It is not a prime number.");
        }
    }
}
