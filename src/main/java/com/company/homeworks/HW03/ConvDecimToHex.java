package com.company.homeworks.HW03;

import static java.lang.Math.*;
import java.util.Random;

public class ConvDecimToHex {
    public static void main(String[] args) {
        int hexArr[] = new int[10];
        double res=0;
        int dec = new Random().nextInt(1000);
        System.out.println(dec);
        System.out.println("From decimal to hex: ");
        int i=0;
        while(dec>=16) {
            hexArr[i]=dec%16;
            dec=dec/16;
            i++;
        }
        hexArr[i]=dec;
        for(int j=i;j>=0;j--) {
            switch (hexArr[j]){
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
                default:
                    System.out.print(hexArr[j]);
            }
        }
        System.out.println("");
        System.out.println("From hex to decimal: ");
        for(int k=i; k>=0;k--){
            res =res+hexArr[k]*pow(16,k);
        }
        System.out.println(res);

    }
}
