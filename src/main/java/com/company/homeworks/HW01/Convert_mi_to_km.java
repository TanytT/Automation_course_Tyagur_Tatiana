package com.company.homeworks.HW01;
import java.util.Scanner;

public class Convert_mi_to_km {
    public static void main(String[] args) {

        double mi=0;
        double km=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of miles: ");
        mi = in.nextDouble();
        km = mi/1.609;
        System.out.println("In kilometers: "+ km);
        mi = 1.609*km;
        System.out.println("In miles: "+mi);

    }
}
