package com.company.homeworks.HW01;
import java.util.Scanner;


public class Time_Calc {
    public static void main(String[] args) {
        int sec, days, hours, min;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of days: ");
        days = in.nextInt();
        if (days<0){
            System.out.println("Incorrect input.");
            return;
        }
        hours = days*24;
        System.out.println("Number of hours: " + hours);
        min = hours*60;
        System.out.println("Number of minutes: "+min);
        sec = min*60;
        System.out.println("Number of seconds: " + sec);
 //-------------------seconds-to-time-----------------------------------------
        System.out.println("Input number of seconds: ");
        int sec1 = in.nextInt();
        if (sec1<0){
            System.out.println("Incorrect input.");
            return;
        }
        int min1 = sec1/60;
        int hour1 = min1/60;
        int days1 = hour1/24;
        System.out.println("Days:"+ days1 + "  hours:"+ hour1%24+ "  minutes:" +min1%60+ "  seconds:"+sec1%60);

    }
}
