package com.company.homeworks.HW05;


public class CountWords {
    public static void main(String[] args) {
        String text="Any word character (letter, number, underscore)";
        String [] res= text.split("\\W+");
        System.out.println("Number of words is: "+res.length);
    }
}
