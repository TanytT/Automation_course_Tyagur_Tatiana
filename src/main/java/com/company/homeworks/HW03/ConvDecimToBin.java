package com.company.homeworks.HW03;
import static java.lang.Math.*;
import java.util.Random;

public class ConvDecimToBin {
    public static void main(String[] args) {
        System.out.println("From decimal to binary: ");
        int dec= new Random().nextInt(100);
        int dec1=dec;
        int bin;
        System.out.println(dec);
        System.out.println("First variant: ");
        String res="";
        while (dec!=0){
            bin= dec%2;
            dec= dec/2;
            res= bin + res;
        }
        System.out.println(res);

        System.out.println("Second variant: ");
        int binArray[]=new int[10];
        int i=0;
        while (dec1!=0){
            binArray[i]= dec1%2;
            dec1= dec1/2;
            i++;
        }
        for(int j=i-1;j>=0;j--) {
            System.out.print(binArray[j]);
        }
        System.out.println("");
        System.out.println("From binary to decimal: ");
        double decRes=0;
        for(int j=i;j>=0;j--) {
            if(binArray[j]==1){
               decRes= decRes+binArray[j]*(pow(2,j));
            }
        }
        System.out.print(decRes);

    }
}
