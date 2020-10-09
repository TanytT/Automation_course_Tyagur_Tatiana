package com.company.homeworks.HW02;

import java.util.Random;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = new Random().nextInt(100);
        System.out.println(mark);
        if (mark>=50){
            System.out.println("PASS.");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
