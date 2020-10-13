package com.company.homeworks.HW03;

import java.util.Random;

public class FibonachiNum {
    public static void main(String[] args) {
        int num = new Random().nextInt(20);
        int [] arrFibon = new int[num];
        arrFibon[0]=0;
        arrFibon[1]=1;
        for (int i = 2; i < num; i++) {
            arrFibon[i]=arrFibon[i-1]+arrFibon[i-2];
        }
        System.out.println("The numbers of Fibonacci till "+ num+": ");
        for (int j = 0; j < num; j++) {
            System.out.print(arrFibon[j]+"  ");
        }
    }
}
