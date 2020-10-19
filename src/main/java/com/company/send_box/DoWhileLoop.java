package com.company.send_box;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1;
        int num2;
        int str=1;

        do {
            System.out.print("Enter the first number: ");
            num1 = console.nextInt();
            System.out.print("Enter the second number: ");
            num2 = console.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Do you want to continue?Press 1.");
            str=console.nextInt();
         }while (str==1);

    }
}
