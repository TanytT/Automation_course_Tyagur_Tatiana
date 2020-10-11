package com.company.homeworks.HW01;
import java.util.Scanner;


public class Convert_m_to_inc {
    public static void main(String[] args) {
        double m=0;
        double inc=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of meters: ");
        m = in.nextDouble();
        if(m<0){
            System.out.println("Incorrect input.");
            return;
        }
        inc = m/39.37;
        System.out.println("In inches: "+inc);
        m = 39.37*inc;
        System.out.println("In meters: "+ m);
    }
}
