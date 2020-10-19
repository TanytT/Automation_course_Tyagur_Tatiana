package com.company.send_box;


public class ReverseDig {
    public static void main(String[] args) {
        String num = "123456925";
        char arr[] =num.toCharArray();
        char temp;
        System.out.println("Reverse string:");
        System.out.println(num);
        for (int i = 0; i <arr.length/2 ; i++) {
            temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Reverse integer numbers:");
        int tem;
        int res=0;
        int number= 34523411;
        System.out.println(number);
        while(number>0){
            tem=number%10;
            number=number/10;
           res=res*10+tem;
        }
        System.out.print(res);
    }
}
