package com.company.homeworks.HW03;

import java.util.Arrays;
import java.util.Random;

public class MinNumInArr {
    public static void main(String[] args) {
        int lenght = new Random().nextInt(20);
        int intArr[]=new int[lenght];

        for (int i = 0; i < lenght; i++) {
            intArr[i]= new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(intArr));
        int min=intArr[0];
        for (int i = 1; i < lenght; i++) {

            if(min>intArr[i]){
                min=intArr[i];
            }
        }
        System.out.println(min);
    }
}
