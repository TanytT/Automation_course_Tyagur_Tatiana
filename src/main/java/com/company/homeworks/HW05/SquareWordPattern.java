package com.company.homeworks.HW05;

public class SquareWordPattern {
    public static void main(String[] args) {
        String word = "help";
        System.out.println(word);
        for (int j = 1; j < word.length(); j++) {
            System.out.println(word.substring(j).concat(word.substring(0,j)));
        }
    }
}
