package com.company.homeworks.HW02;

import java.util.Random;

public class PrintDayInWord {
    public static void main(String[] args) {
        int day= new Random().nextInt(9);
        System.out.println(day);
///////////////Use if..else////////////////////////////////////
        System.out.println("Use if..else:");
        if(day==1){
            System.out.println("Sunday");
        }else if(day==2){
            System.out.println("Monday");
        }else if(day==3){
            System.out.println("Tuesday");
        }else if(day==4){
            System.out.println("Wednesday");
        }else if(day==5){
            System.out.println("Thursday");
        }else if(day==6){
            System.out.println("Friday");
        }else if(day==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Not a valid day!");
        }
 ////////////////////////////use switch-case/////////////////////////
        System.out.println("Use switch-case:");
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day!");
        }
    }
}
