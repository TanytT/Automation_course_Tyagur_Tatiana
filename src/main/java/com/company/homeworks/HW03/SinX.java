package com.company.homeworks.HW03;

import static java.lang.Math.*;

public class SinX {
    public static void main(String[] args) {
        double x=0.;
        while(x<=360) {
            System.out.print("sin("+x+"): ");
            System.out.print(sin(x));
            System.out.println("");
            x+=10;
        }
    }
}
