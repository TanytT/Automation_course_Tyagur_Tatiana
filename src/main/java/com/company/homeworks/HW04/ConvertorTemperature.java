package com.company.homeworks.HW04;

public class ConvertorTemperature {
    public static double tempCtoK(double cels){
        double kel=cels+273.16;
        return kel;
    }
    public static double tempKtoC(double kelv){
        double cel=kelv-273.16;
        return cel;
    }
    public  static double tempCtoF(double cels){
        double far = 9./5 *cels + 32;
        return far;
    }
    public static double tempFtoC(double far){
        double cel=5./9 * (far-32);
        return cel;
    }
    public static void main(String[] args) {
        double temper = 28.5;
        double kelv =tempCtoK(temper);
        System.out.println("In Kelvin: "+kelv);
        double cel =tempKtoC(kelv);
        System.out.println("In Celsius: "+cel);
        double far=tempCtoF(cel);
        System.out.println("In Fahrenheit:"+far);
        double cels=tempFtoC(far);
        System.out.println("In Celsius:"+cels);
    }
}
