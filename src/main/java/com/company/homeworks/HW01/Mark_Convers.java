package com.company.homeworks.HW01;
import java.util.Scanner;

public class Mark_Convers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mark you can get for the test: ");
        int max_mark= in.nextInt();
        if (max_mark<0){
            System.out.println("Incorrect input.");
            return;
        }
        System.out.println("Enter the mark you have received for the test: ");
        int your_mark= in.nextInt();
        if ((your_mark<=max_mark)&&(your_mark>=0)){
        double perc= your_mark*100./max_mark;
        System.out.println("The percentage is: " +perc +"%");}
        else System.out.println("Incorrect input!");
    }
}
