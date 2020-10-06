package com.company.homeworks.HW01;
import java.util.Scanner;

public class Convert_kg_to_pounds {
    public static void main(String[] args) {
        double kg=0;
        double pound=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of kilograms: ");
        kg = in.nextDouble();
        if (kg<0){
            System.out.println("Incorrect input.");
            return;
        }
        pound = kg/2.2046;
        System.out.println("In pounds: "+ pound);
        kg = 2.2046*pound;
        System.out.println("In kilograms: "+kg);

    }
}
