package com.company.homeworks.HW05;

public class CountLetters {
    public static void main(String[] args) {
        String str="В древнем городе Лондоне , в один осенний день второй половине шестнадцатого столетия , в бедной семье по фамилии Канти родился ребенок – мальчик .";
        String [] res= str.split(" ");
        char [] ch;
        int cnt=0;
        for (int i = 0; i < res.length; i++) {
            ch = res[i].toCharArray();
            if(ch.length==1){
                cnt++;
            }
        }
        System.out.println("Number of single characters: "+cnt);
    }
}
