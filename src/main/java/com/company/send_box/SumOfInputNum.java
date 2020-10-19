package com.company.send_box;

import java.util.Scanner;

public class SumOfInputNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num2;
        int cntPos=0;
        int cntZero=0;
        int cntNeg=0;
        int max=0, min=0;
        char ch;
        do {
            System.out.print("Enter the number: ");
            num2 = console.nextInt();
            if(num2>max){
                max=num2;

            }else if(num2<min){
                min=num2;
            }
            if(num2>0){
                cntPos++;
            }else if(num2==0){
                cntZero++;
            }else{
                cntNeg++;
            }
            System.out.print("Do you want to continue? y/n ");
            ch=console.next().charAt(0);


        }while(ch=='y'||ch=='Y');
        System.out.println("count of positive numbers:"+cntPos);
        System.out.println("count of zero numbers:"+cntZero);
        System.out.println("count of negative numbers:"+cntNeg);
        System.out.println("The bigger number is:"+max);
        System.out.println("The lower number is:"+min);
    }
}
