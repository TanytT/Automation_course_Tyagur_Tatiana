package com.company.homeworks.HW01;
import java.util.Scanner;

public class Conversion_F_to_C {
    public static void main(String[] args) {
        double celcius=0;
        double far=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input degrees F: ");
        far = in.nextDouble();
        celcius = 5./9 * (far-32);
        System.out.println(celcius);
    }
}


