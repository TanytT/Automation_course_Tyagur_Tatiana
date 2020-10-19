package com.company.send_box;

import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        int num = 1;
        int n = new Random().nextInt(10);
        System.out.println(n);
        if(n!=0) {
            for (int i = 1; i <= n; i++) {
                num = num * i;
            }
            System.out.print(num);
        }else System.out.println(1);

        
    }
}
