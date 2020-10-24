package com.company.homeworks.HW04;

import java.util.Random;

public class ConvertWeight {
    public static double convPtoKg(double pound){
        double kg = 2.2046*pound;
        return kg;
    }
    public static double convKgToP(double kg){
        double pounds=kg/2.2046;
        return pounds;
    }
    public static void main(String[] args) {
        int poun = new Random().nextInt(1000);
        System.out.println(poun);
        double kilogr = convPtoKg(poun);
        System.out.println("In kilograms:"+kilogr);
        double p=convKgToP(kilogr);
        System.out.println("In pounds:" + p);

    }
}
