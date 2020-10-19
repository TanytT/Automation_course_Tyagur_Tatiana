package com.company.lectures.lecture06;

import java.util.Random;

public class LoopsApp {
    public static void main(String[] args) {

        for (int circle=1; circle<8; circle++)
            System.out.println("Running"+circle);
        int rand = new Random().nextInt(100);
        for (int i=0;i<rand;i+=2){
            System.out.print(i+" ");
        }
        for (int j=0;j<=10;j++){
            if(j%3==0)
                continue;
            if(j%7==0)
                break;
            System.out.println(" Task "+j+" ");
        }
    }
}
