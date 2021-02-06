package com.company.homeworks.HW32;

public class StringOperations {

    public int countOfWords(String str){
        String [] strArr = str.split(" ");
        return strArr.length;
    }

    public boolean isPalindrome(String str){
        String newStr = str.replace(" ","").toLowerCase();
        char[] chArr = newStr.toCharArray();
        for(int i =0; i< newStr.length()/2; i++){
            if(chArr[i]!=chArr[newStr.length()-1-i]){
                return false;
            }
        }
        return true;
    }

    public String reverseString(String str){
        char[] chArr = str.toCharArray();
        char [] chRes = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            chRes[i] = chArr[str.length()-1-i];
        }
        return new String(chRes);
    }
}
