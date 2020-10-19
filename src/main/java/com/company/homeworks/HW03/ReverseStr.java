package com.company.homeworks.HW03;

import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {
        String str="Hello world!";
        char [] strArr= str.toCharArray();
        char temp;
        System.out.println(str);
        for (int i = 0,j=strArr.length; i < j; i++) {
            temp=strArr[i];
            strArr[i]=strArr[j-1];
            strArr[j-1]=temp;
            j--;
        }
        for (int j = 0; j < strArr.length; j++) {
            System.out.print(strArr[j]);
        }
    }
}
