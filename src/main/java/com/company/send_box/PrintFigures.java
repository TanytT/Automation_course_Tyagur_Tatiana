package com.company.send_box;

public class PrintFigures {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j<=i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >0; j--) {
                if(j<=i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int k=4;
        for (int i =5; i>0; i--) {
            for (int j = 1; j <=9; j++) {
                if((j<=10-i)&&(j>k)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            k=k-1;
            System.out.println();
        }
        System.out.println();
        int l=4;
        for (int i =5; i>0; i--) {
            for (int j = 1; j <=9; j++) {
                if((j<=10-i)&&(j>l)) {
                    System.out.print(6-i);
                }else{
                    System.out.print(" ");
                }
            }
            l=l-1;
            System.out.println();

        }

        System.out.println();
        int n=4;int m=1;int p=1;
        for (int i =1; i<=5; i++) {
            for ( int s= n; s >0; s--) {
                System.out.print(" ");
            }
            n--;
            for (int j = 1; j <=p; j++) {
                if (p <= 9) {
                    if(j<=i) {
                        System.out.print(i+1-j);
                    }else{
                        System.out.print(j-i+1);
                    }
                }
            }
            p+=2;
            System.out.println();
        }

    }
}
