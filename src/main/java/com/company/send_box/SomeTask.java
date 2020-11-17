package com.company.send_box;

public class SomeTask {
    public static void main(String[] args) {
        String numberString="25618";
        String res="";
        char[] chArr=numberString.toCharArray();
            for(int i=0; i<numberString.length(); i++) {
                if(Character.getNumericValue(chArr[i])<5){

                  chArr[i]='0';
                }else {
                    chArr[i]='1';
                }
            res+=chArr[i];
            }
        System.out.println(res);
        }

}
