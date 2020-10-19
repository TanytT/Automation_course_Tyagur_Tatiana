package com.company.send_box;
import java.util.Arrays;

import static java.lang.Math.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int temp;
        int i,res;
        double sum;
        int cnt=0;
        int num[]= new int[3];
        for (i = 1; i <=500; i++) {
            res=i;
            sum=0;
            for (int j = 2; j >=0; j--) {
                num[j]=res%10;
                temp=res/10;
                res=temp;
            }
            if(num[0]!=0){
                cnt=3;
            }
            else if(num[1]!=0){
                cnt=2;
            }else {
                cnt=1;
            }
            for (int j = 0; j < 3; j++) {
                sum=sum+pow(num[j],cnt);
            }
            if(i==sum){
                System.out.println("It is an Armstrong number:"+ i);
            }
        }
        System.out.println("Second way:");
        int n1,n2,n3;
        int tmp;
        for (int j = 1; j <=500; j++) {
            tmp=j;
            n1=tmp%10;
            tmp=tmp/10;
            n2=tmp%10;
            tmp=tmp/10;
            n3=tmp%10;
            if(j==n1*n1*n1+n2*n2*n2+n3*n3*n3){
                System.out.println("It is an Armstrong number:"+j);

            }

        }

    }
}
