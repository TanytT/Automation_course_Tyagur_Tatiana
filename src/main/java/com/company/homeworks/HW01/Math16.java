package com.company.homeworks.HW01;

import static java.lang.Math.*;
public class Math16 {
    public static void main(String[] args) {
        double x=34;
        double y= pow( (pow(E,2*x)*sqrt(x) - (x + 1./3)/x), 1./3) *abs(cos(2.5*x));
        System.out.println(y);
    }
}
