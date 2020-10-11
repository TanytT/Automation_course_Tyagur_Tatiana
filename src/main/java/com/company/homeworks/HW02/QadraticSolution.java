package com.company.homeworks.HW02;
import static java.lang.Math.*;

public class QadraticSolution {
    public static void main(String[] args) {
        double a = 10;
        double b= -25;
        double c= 8;
        double x1,x2;
        double discr;
        discr=pow(b,2)-4*a*c;
        if (a==0){
            x1=(-c)/b;
            System.out.println("Result if a=0: "+x1);
        }else if(discr<0){
            System.out.println("No solutions.");
        }else if(discr==0){
            x1=(-b)/2*a;
            System.out.println("One solution:" +x1);
        }else {
            x1=((-b)+sqrt(discr))/2*a;
            x2=((-b)-sqrt(discr))/2*a;
            System.out.println("Result x1 = "+x1);
            System.out.println("Result x2 = "+x2);
        }
    }
}
