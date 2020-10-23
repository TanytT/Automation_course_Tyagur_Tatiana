package com.company.homeworks.HW05;

public class UpperLowerСaseСhange {

    public static String stringsFunct(String mode, String str){
        String res = "";
        switch (mode){
            case "To Upper case":
                res=str.toUpperCase();
                break;
            case "To lower case":
                res=str.toLowerCase();
                break;
            case "First letter of word to Upper case":
                String [] words;
                words=str.split(" ");
                for(String res1:words){
                    res+=res1.substring(0,1).toUpperCase()+res1.substring(1).toLowerCase()+" ";
                }
                break;
            case "First letter of word to Lower case":
                String [] words1;
                words1=str.split(" ");
                for(String res1:words1){
                    res+=res1.substring(0,1).toLowerCase()+res1.substring(1).toUpperCase()+" ";
                }
                break;
            case "First letter of sentence to Upper case":
                String [] sentence;
                sentence=str.toLowerCase().split("\\. ");
                for(String res1:sentence){
                    res+=res1.substring(0,1).toUpperCase()+res1.substring(1)+". ";
                }
                break;
            case "First letter of sentence to Lower case":
                String [] sentence1;
                sentence1=str.toUpperCase().split("\\. ");
                for(String res1:sentence1){
                    res+=res1.substring(0,1).toLowerCase()+res1.substring(1)+". ";
                }
                break;
        }
       return res;
    }

    public static void main(String[] args) {
        String text="Change given text into all upper case or lower case. Or change the first letter of Each word ( or sentence ) to upper and the rest to lower, etc.";
        System.out.println("To Upper case: \n"+stringsFunct("To Upper case", text));
        System.out.println("To lower case: \n"+stringsFunct("To lower case", text));
        System.out.println("First letter of word to Upper case: \n"+stringsFunct("First letter of word to Upper case", text));
        System.out.println("First letter of word to Lower case: \n"+stringsFunct("First letter of word to Lower case", text));
        System.out.println("First letter of sentence to Upper case: \n"+stringsFunct("First letter of sentence to Upper case", text));
        System.out.println("First letter of sentence to Lower case: \n"+stringsFunct("First letter of sentence to Lower case", text));

    }
}
