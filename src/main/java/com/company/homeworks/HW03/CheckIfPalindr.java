package com.company.homeworks.HW03;

import java.util.Arrays;

public class CheckIfPalindr {
    private static char[] ToLowerCase(char[] str){
        char result[] = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            int cur=(int)str[i];
            if((cur>=65)&&(cur<=90)){
                cur+=32;
            }else if((cur>=97)&&(cur<=122)){
                result[i]=(char)cur;
             }else {
                cur=32;
            }
            result[i]=(char)cur;
        }
       return result;
    }
    public static void main(String[] args) {
        boolean m=true;
        String str="Madam, I'm Adam";
        char[] res=str.toCharArray();
        res = ToLowerCase(res);
        System.out.println(str);
        int i=0;
        int j=res.length-1;
        while (i<j){
            if(res[i]==' '){
                i++;
                continue;
            }
            if(res[j]==' '){
                j--;
                continue;
            }
            if(res[i]!=res[j]){
                m=false;
                break;
            }
            i++;
            j--;
         }
        if(m==true) {
            System.out.println("It is a palindrome.");
        }else {
            System.out.println("It is not a palindrome.");
        }
    }
}
