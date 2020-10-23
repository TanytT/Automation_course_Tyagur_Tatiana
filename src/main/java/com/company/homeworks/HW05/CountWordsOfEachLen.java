package com.company.homeworks.HW05;

public class CountWordsOfEachLen {
    public static void main(String[] args) {
        String text = "В древнем городе Лондоне в один осенний день во второй половине шестнадцатого столетия, в бедной семье по фамилии Канти родился ребенок - мальчик.";
        String [] str= text.split(" ");
        int cnt=1;
        int k=0;
        int count[]=new int[str.length];
        char[] chars;
        for (int i = 0; i < str.length; i++) {
            chars= str[i].toCharArray();
            count[i]= chars.length;
        }
        for (int l = 0; l <count.length ; l++) {
            for (int i = 0; i < count.length; i++) {
                if(cnt==count[i]){
                    k++;
                }
            }
            if(k!=0) {
                System.out.println("Number of words with "+cnt+" letters: "+k);
            }
            cnt++;
            k=0;
        }
    }
}
