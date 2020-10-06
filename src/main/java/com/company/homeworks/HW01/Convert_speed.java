package com.company.homeworks.HW01;
import java.util.Scanner;

public class Convert_speed {
    public static void main(String[] args) {
        double km_hr=0;
        double mi_hr=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input speed in km/hr: ");
        km_hr = in.nextDouble();
        mi_hr = km_hr/0.6214;
        System.out.println("Speed in mi/hr: "+ mi_hr);
        km_hr = 0.6214*mi_hr;
        System.out.println("Speed in km/hr: "+km_hr);

    }
}
