package com.company.homeworks.HW03;

import java.util.Random;

public class SumOf2Colum {
    public static void main(String[] args) {
        int m = new Random().nextInt(15);
        int n = new Random().nextInt(15);
        System.out.println("The size of row_1: " +m);
        System.out.println("The size of row_2: " +n);
        int row1 [] = new int[m];
        int row2 [] = new int[n];
        for (int i = 0; i < m; i++) {
            row1[i]= new Random().nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            row2[i]= new Random().nextInt(100);
        }
        System.out.println("|row_1| row_2| sum |");
        if(m==n){
             for (int i = 0; i < m; i++) {
                System.out.println("|  "+row1[i]+" |  "+row2[i]+"  |  "+(row1[i]+row2[i])+" |");
            }
        }else if(m>n){
              for (int i = 0; i < m; i++) {
                System.out.println("|  " + row1[i] + " |  " );
            }
            System.out.println("The row_1 is bigger.");
        }else{
            for (int i = 0; i < n; i++) {
                System.out.println("|     |  "+row2[i]+"  |  " +"   |");
            }
            System.out.println("The row_2 is bigger.");
        }

    }
}
