package com.company.homeworks.HW02;
import static java.lang.Math.*;
import java.util.Random;

public class CheckMagnitude {
    public static void main(String[] args) {
        int a = 45;
        int b = -99;
        if (abs(a)>abs(b)){
            System.out.println("The magnitude of 1 number is greater: "+ abs(a) +">"+ abs(b));
        }else if(abs(a)<abs(b)){
            System.out.println("The magnitude of 2 number is greater: "+ abs(b) +">"+ abs(a));
        }else {
            System.out.println("The numbers have the equal magnitudes.");
        }
    }
}
