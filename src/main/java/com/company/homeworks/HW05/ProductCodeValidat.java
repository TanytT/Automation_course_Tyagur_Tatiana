package com.company.homeworks.HW05;

public class ProductCodeValidat {
    public static void main(String[] args) {
        String code="AX6BYU56UX6CV6BNT7NM 287430";
        String [] codeParts = code.split(" ");
        String str1 = codeParts[0].replaceAll("\\d","");
        String str2 = codeParts[0].replaceAll("\\D","");
        int var=Integer.parseInt(str2.substring(0,2));
        for (int i = 2; i <= str2.length()-2; i+=2) {
            var*=Integer.parseInt(str2.substring(i,i+2));
        }
        if((str2.length()!=6)||(!str1.equals(str1.toUpperCase()))||(var!=Integer.parseInt(codeParts[1]))){
            System.out.println("Incorrect product code.");
        }else{
            System.out.println("Correct code!");
        }
    }
}
