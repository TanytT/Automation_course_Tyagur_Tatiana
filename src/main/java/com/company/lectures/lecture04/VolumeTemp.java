package com.company.lectures.lecture02;

public class
VolumeTemp {
    public static void main(String[] args) {
        double t1=25;
        double t2=10;
        double v1=50;
        double v2= 20;
        double res=0;
        res = (v1*t1+v2*t2)/(v1+v2);
        System.out.println("Result: "+res);
        System.out.println("Volume " + v1+v2);
    }
}
