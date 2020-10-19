package com.company.send_box;

import java.util.Random;

public class SumOfOddEven {
    public static void main(String[] args) {
        int arrInt[] = new int[10];
        int odd = 0;
        int even =0;
        for (int i = 0; i < 10; i++) {
            arrInt[i]= new Random().nextInt(25);
            System.out.print(arrInt[i]+" ");
        }
        for (int j = 0; j < 10; j++) {
            if(arrInt[j]%2==1){
                odd += arrInt[j];
             }else{
                even+=arrInt[j];
            }
        }
        System.out.println();
        System.out.println("Sum of odd numbers: "+odd);
        System.out.println("Sum of even numbers: "+even);
    }
}
