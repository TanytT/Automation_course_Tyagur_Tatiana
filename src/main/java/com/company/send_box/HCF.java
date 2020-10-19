package com.company.send_box;

import java.util.Random;

public class HCF {
    public static void main(String[] args) {
        int num1= new Random().nextInt(100);
        int num2= new Random().nextInt(100);
        System.out.println(num1);
        System.out.println(num2);
        int hcf=1;
        int coun;
        if(num1>num2) {
            coun = num1;
        }else{
            coun=num2;
        }
        if(num1==0&&num2==0){
            System.out.println("No solutions.");
        }else {
            for (int i = 2; i < coun; i++) {
                int a= num1%i;
                int b= num2%i;
                if(( a==0)&&(b==0)){
                    hcf=i;
                }
            }
            System.out.println("HCF: "+hcf);
        }

        int dividend=num1, divisor=num2;
        int remainder, hcf1 = 0;
        do
        {
            remainder = dividend % divisor;

            if(remainder == 0)
            {
                hcf1 = divisor;
            }
            else
            {
                dividend = divisor;
                divisor = remainder;
            }

        }while(remainder != 0);

        System.out.println("HCF: " + hcf1);
    }
}


