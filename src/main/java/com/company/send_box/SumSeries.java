package com.company.send_box;
import static java.lang.Math.*;
import java.util.Random;

public class SumSeries {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        double sum=0;
        for (int i = 1; i <=num; i++) {
            sum+=1./i;
        }
        System.out.println("Sum of "+num+" numbers is: "+sum);
        double res=0;
        for (int i = 2; i <= num; i++) {
            if((i-1)%2==1){
               res+=1./(i-1)-(1./i);
            }
        }
        System.out.println(res);
        System.out.println("Log= "+log(res)/log(2.));

    }
}
