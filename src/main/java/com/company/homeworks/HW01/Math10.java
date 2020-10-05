package com.company.homeworks.HW01;
import static java.lang.Math.*;

public class Math10 {
    public static void main(String[] args) {
        double x = 50;
        double y = (1./3)* sqrt(abs(sin(x))) * pow(pow(E, (0.12*x)),1./3);
        System.out.println(y);
    }
}
