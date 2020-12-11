package com.company.homeworks.HW18;

public class StringFunctions {

    public String concatenate(String a, String b, String c){
        return (a+b+c).trim();
    }

    public boolean isContain(String a, String b){
        return a.contains(b);
    }

    public char[] strToArr(String str){
        return str.toCharArray();
    }

    public String funcIfNull(String str){
        return str;
    }

    public String[] strToStrArr(String str) {
        return str.split(" ");
    }


}
