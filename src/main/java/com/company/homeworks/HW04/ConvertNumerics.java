package com.company.homeworks.HW04;

import java.util.Random;

import static java.lang.Math.pow;

public class ConvertNumerics {
    public static int[] decToBin(int dec){
        int resArr[]=new int[10];
        int i=0;
        while (dec!=0){
            resArr[i]= dec%2;
            dec= dec/2;
            i++;
        }
        return resArr;
    }
    public static double binToDec(int [] binArray){
        double decRes=0;
        for(int j=binArray.length-1;j>=0;j--) {
            if(binArray[j]==1){
                decRes= decRes+binArray[j]*(pow(2,j));
            }
        }
       return decRes;
    }
    public static int[] decToHex(int dec){
        int hexArr[] = new int[10];
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
        return hexArr;
    }
    public static double hexToDec(int [] hexArr){
        double result=0;
        for(int k=hexArr.length-1; k>=0;k--){
            result = result+hexArr[k]*pow(16,k);
        }
        return result;
    }
    public static void main(String[] args) {
        int decim= new Random().nextInt(500);
        System.out.println(decim);
        int binArr[]=new int[10];
        binArr=decToBin(decim);
        System.out.println("Decimal to binary: ");
        for(int j=binArr.length-1;j>=0;j--) {
            System.out.print(binArr[j]);
        }
        System.out.println();
        double decRes=binToDec(binArr);
        System.out.println("Binary to decimal: "+decRes);
        int [] hexArr=new int[10];
        System.out.println("Decimal to hex: ");
        hexArr=decToHex(decim);
        System.out.println();
        double resHex=hexToDec(hexArr);
        System.out.println("Hex to decimal: " +resHex);
    }
}
