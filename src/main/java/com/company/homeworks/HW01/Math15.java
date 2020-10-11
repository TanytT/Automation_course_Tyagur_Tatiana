package com.company.homeworks.HW01;
import static java.lang.Math.*;

public class Math15 {
    public static void main(String[] args) {
        double x=66;
        double y= (abs(x*log(x)-4)*sqrt(x)) * (1/(pow( pow(E, (4*x-1)), 1./5)));
        System.out.println(y);
    }
}
