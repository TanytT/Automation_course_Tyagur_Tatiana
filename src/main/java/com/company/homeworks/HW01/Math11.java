package com.company.homeworks.HW01;
import  static java.lang.Math.*;

public class Math11 {
    public static void main(String[] args) {
        double x=50;
        double y= 2*PI*x - abs(sin(sqrt(10.5*x))) * (1./(pow(x*x,1./3)+1./7));
        System.out.println(y);
    }
}
