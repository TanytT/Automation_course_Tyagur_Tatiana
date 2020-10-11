package com.company.homeworks.HW01;
import static java.lang.Math.*;

public class Math13 {
    public static void main(String[] args) {
        double x=40;
        double y= pow( pow(E, x-2),1./5) * (1./sqrt(x*x + pow(x,4) +log(abs(x-3.14))));
        System.out.println(y);
    }
}
