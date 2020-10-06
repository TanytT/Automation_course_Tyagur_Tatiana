package com.company.homeworks.HW01;
import java.util.Scanner;

public class Conversion_C_to_F {
    public static void main(String[] args) {
        double celcius =0;
        double far=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input degrees C: ");
        celcius = in.nextDouble();
        far = 9./5 *celcius + 32;
        System.out.println(far);

    }
}
