package com.company.send_box;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = new Random().nextInt(50);
        int numUser;
        System.out.println(num);
        Scanner console = new Scanner(System.in);

           System.out.print("Enter the number ");
           numUser = console.nextInt();
        while(num!=numUser) {
           if(numUser>num){
               System.out.println("Too high, try again.");
               numUser = console.nextInt();
               continue;
           }else if(numUser<num){
               System.out.println("Too low, try again.");
               numUser = console.nextInt();
               continue;
           }

        }
        System.out.println("You gessed! "+ num);

    }
}
