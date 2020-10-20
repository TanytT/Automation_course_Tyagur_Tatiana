package com.company.homeworks.HW04;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QadrSolut {
    public static double discr(double a,double b,double c){
        double dis = pow(b,2)-4*a*c;
        return dis;
    }
    public static double x1Res(double discr, double a, double b){
        double x1=((-b)+sqrt(discr))/2*a;
        return x1;
    }
    public static double x2Res(double discr, double a, double b){
        double x2=((-b)-sqrt(discr))/2*a;
        return x2;
    }
    public static void main(String[] args) {
        double a = -15.5;
        double b= -25;
        double c= 8;
        double x1;
        double discr;
        discr=discr(a,b,c);
        if (a==0){
            x1=(-c)/b;
            System.out.println("Result if a=0: "+x1);
        }else if(discr<0){
            System.out.println("No solutions.");
        }else if(discr==0){
            System.out.println("One solution:" +x1Res(0,a,b));
        }else {
            System.out.println("Result x1 = "+x1Res(discr,a,b));
            System.out.println("Result x2 = "+x2Res(discr,a,b));
        }
    }
}
