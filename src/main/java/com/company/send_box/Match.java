package com.company.send_box;

import java.util.Arrays;

public class Match {

    public static void main(String[] args) {
        String[] str = new String[]{"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        System.out.println(Arrays.asList(str));
        System.out.println(points(str));
        System.out.println(xor(false,false));
        System.out.println(xor(false,true));
        System.out.println(xor(true,false));
        System.out.println(xor(true,true));

    }
    public static String solution(String str) {
        String res="";
        for (int i = str.length()-1; i >=0; i--) {
            res+=str.charAt(i);
        }
        return res;
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum=0;
        for(int i :classPoints ){
            sum+=i;
        }
        return (sum+yourPoints)/(classPoints.length+1)<yourPoints;
    }
    public static boolean xor(boolean a, boolean b) {
        return a!=b;
    }

    public static int points(String[] games) {
        int cnt = 0;
        String [] res = new String[2];
        for (int i = 0; i < games.length; i++) {
            res = games[i].split(":");
            if(Integer.parseInt(res[0])>Integer.parseInt(res[1])){
                cnt+=3;
            }else if(Integer.parseInt(res[0])==Integer.parseInt(res[1])){
                cnt+=1;
            }
        }
        return cnt;
    }
}
