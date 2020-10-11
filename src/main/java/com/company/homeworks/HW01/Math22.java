package com.company.homeworks.HW01;
import  static java.lang.Math.*;

public class Math22 {
    public static void main(String[] args) {
        double x=0.85;
        double y = asin(log10(x) / (pow(x, 2) + 5 * x + 1) - pow(x, 3.2) / 28);
        System.out.println(y);
    }
}
