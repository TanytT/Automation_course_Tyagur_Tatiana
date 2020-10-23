package com.company.homeworks.HW05;


public class LetterRemoval {
    public static String replAll(String str,String letter){
       String res =str.replaceAll(letter,"");
    return res;
    }
    public static void main(String[] args) {
        String text = "В древнем городе Лондоне в один осенний день во второй половине шестнадцатого столетия, в бедной семье по фамилии Канти родился ребенок - мальчик.";
        System.out.println(replAll(text,"ро"));
        System.out.println(replAll(text,"д"));
        System.out.println(replAll(text,"оло"));
    }
}
