package com.company.lectures.lecture06;
import java.util.Random;

import static java.lang.Math.*;
public class Task1 {
    public static void main(String[] args) {
        double bmi;
        int weight=new Random().nextInt(150);
        double height = new Random().nextInt(220)/100.;
        bmi=weight/pow(height,2);
        if(bmi<=30.0){
            System.out.println("Overweight");
        }else if(bmi<=25.0) {
            System.out.println("Normal");
        }else if(bmi<=18.0) {
            System.out.println("Underweight");
        }   else  {
            System.out.println("Obese");
        }
    }
}
