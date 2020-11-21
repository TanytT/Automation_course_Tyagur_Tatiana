package com.company.lectures.Lecture14;

public class EnumApp {
    public static void main(String[] args) {
        Languages l= Languages.FR;
        System.out.println(l.getCode());

        System.out.println(Languages.EN.getName());
    }
}
