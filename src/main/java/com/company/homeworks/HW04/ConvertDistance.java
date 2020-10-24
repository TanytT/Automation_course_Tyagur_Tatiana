package com.company.homeworks.HW04;

import java.util.Random;

public class ConvertDistance {
    public static double distMtoInc(double m){
        double inc = m/39.37;
        return inc;
    }
    public static double distIncToM(double inc){
        double m = 39.37*inc;
        return m;
    }
    public static double disMilToKm(double mil){
        double km = mil/1.609;
        return km;
    }
    public static double disKmToMil(double km){
        double mi = 1.609*km;
        return mi;
    }
    public static double distKmToM(double km){
        double metr=km*1000;
        return metr;
    }

    public static void main(String[] args) {
        int m = new Random().nextInt(100);
        System.out.println(m);
        double inches=distMtoInc(m);
        double meters=distIncToM(inches);
        System.out.println("In inches: "+inches);
        System.out.println("In meters: "+ meters);
        double km = disMilToKm(m);
        System.out.println("In kilometers:"+km);
        double miles=disKmToMil(km);
        System.out.println("In miles:"+miles);
        double met=distKmToM(km);
        System.out.println("In meters:"+ met);
    }
}
