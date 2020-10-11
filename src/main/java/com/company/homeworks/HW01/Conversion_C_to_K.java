package com.company.homeworks.HW01;
import java.util.Scanner;

public class Conversion_C_to_K {
    public static void main(String[] args) {
        double celcius=0;
        double kelv=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input degrees C: ");
        celcius = in.nextDouble();
        kelv =celcius+273.16;
        System.out.println(kelv);
    }
}
