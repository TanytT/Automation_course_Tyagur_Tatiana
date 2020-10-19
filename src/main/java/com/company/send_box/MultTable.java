package com.company.send_box;

import java.util.Random;

public class MultTable {
    public static void main(String[] args) {
        int num = new Random().nextInt(50);
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" * "+i+" = "+ num*i);
        }

    }
}
