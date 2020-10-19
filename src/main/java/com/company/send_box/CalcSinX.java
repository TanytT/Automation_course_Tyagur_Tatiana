package com.company.send_box;

import java.util.Random;

import static java.lang.Math.pow;

public class CalcSinX {
    private static double Factor(int n) {
        double result=1;
        for (int i = 1; i <= n; i++) {
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        //sin x = x - x3/3! + x5/5! - x7/7! + x9/9!
        int x =new Random().nextInt(25)+1;
        int n = new Random().nextInt(10)+3;
        System.out.println(x);
        System.out.println(n);
        double sin=0;
        int i=3;
        int cnt=1;
        while(i <=n) {
            if(cnt%2==1) {
                sin = sin - pow(x, i) / Factor(i);
            }else{
                sin+=pow(x, i) / Factor(i);
            }
            i += 2;
            cnt++;
        }
       sin = x+sin;
        System.out.println(sin);

    }
}
