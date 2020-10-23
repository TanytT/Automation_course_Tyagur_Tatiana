package com.company.homeworks.HW05;


public class CountWords {
    public static void main(String[] args) {
        String text="В древнем городе Лондоне , в один осенний день во второй половине шестнадцатого столетия, в бедной семье по фамилии Канти родился ребенок - мальчик.";
        String [] res= text.split(" ");
        char[] chars={'!', '.', '-', ',' ,'?',':',';'};
        char[] ch;
        int cnt=0;
        for (int i = 0; i < res.length; i++) {
            ch = res[i].toCharArray();
            if(ch.length==1){
               for (int j = 0; j < chars.length; j++) {
                    if(ch[0]==chars[j]){
                        cnt--;
                    }
                }
            }
            cnt++;
        }
        System.out.println("Number of words is: "+cnt);

    }
}
