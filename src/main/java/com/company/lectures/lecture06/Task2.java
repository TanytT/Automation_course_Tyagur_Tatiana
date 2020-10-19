package com.company.lectures.lecture06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int age =new Random().nextInt(85);
        String str= age<=12?"You`re a kid":
            (age<=17)?"You are teenager":
                    (age<=64)?"You are adult":"You are elderly";

        System.out.println(str);
    }
}
