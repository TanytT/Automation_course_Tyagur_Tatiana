package com.company.homeworks.HW01;
import  java.util.Scanner;
public class General_App_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of correct answers: ");
        int corr_answer= in.nextInt();
        System.out.println("Enter the number of wrong answers: ");
        int wrong_answer= in.nextInt();
        double final_res = corr_answer - (1./4)*wrong_answer;
        System.out.println("Final result: " +final_res);
    }

}
