package com.company.lectures.lecture07;

public class task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j<=i) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 9; i >=0; i--) {
            for (int j = 9; j >=0; j--) {
                if(j<=i) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 9; j >=0; j--) {
                if(j>=i) {
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 9; j >=0; j--) {
                if(j<=i) {
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <9; i++) {

                        for (int j = 0; j < 9; j++) {
                            if(i==0||i==8) {
                        System.out.print("# ");
                            continue;}
                    if ((j == 0) || (j == 8)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==0||i==8){
                    System.out.print("# ");
                }else if(i==j){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 9; j >=0; j--) {
                if(i==0||i==8){
                    System.out.print("# ");
                }else if(i==j){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <9; j++) {
                if(i==0||i==8||i==j||i==8-j){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <9; j++) {
                if(i==0||i==8||i==j||i==8-j||j==0||j==8){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
