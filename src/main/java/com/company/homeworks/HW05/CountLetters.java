package com.company.homeworks.HW05;

public class CountLetters {
    public static void main(String[] args) {
        String str = "Hello world!";
        char[] charArr = new char[str.length()];
        int cnt = 0;
        for (int i = 0; i <str.length() ; i++) {
            boolean fl=false;
            for (int k = 0; k < charArr.length; k++) {
                if(str.charAt(i)==charArr[k]){
                    fl=true;
                    break;
                }
            }
            if(fl){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                        cnt++;
                }
            }
            charArr[i]=str.charAt(i);
            System.out.println("Number of "+charArr[i]+" symbols = "+cnt);
            cnt=0;
        }

    }
}
