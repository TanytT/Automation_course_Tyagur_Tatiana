package com.company.send_box;

import java.util.Random;

public class TurnString {
    public static void main(String[] args) {
        //для переворачивания строки, изменив расположение символов в строке задом
        // наперёд без использования встроенных в String функций.
        String str = "Hello world!";
        System.out.println(str);
        String stRez="" ;
        for (int i = 0; i < str.length(); i++) {
            stRez+=str.charAt(str.length()-1-i);
        }
        System.out.println(stRez);
        System.out.println();
        //для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной
        int a=45;
        int b=68;
        /*int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        System.out.println();*/
        //поменять местами значения, хранящиеся в двух переменных, без использования третьей переменной.
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        System.out.println();
        //является ли число простым или нет
        int a1=new Random().nextInt(99)+1;
        System.out.println(a1);
        boolean fl=true;
        for (int i =2; i<a1; i++) {
            if(a1%i==0){
                fl=false;
                break;
            }
        }
        if(fl){
            System.out.println("It is a Prime number");
        }else{
            System.out.println("It is not prime number.");
        }
        System.out.println();
        // чтобы найти второе по величине число в массиве.
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(100);
            System.out.print(arr[i]+" ");
        }
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println();
        System.out.println(arr[1]);
        //удаления всех пробелов из строки с помощью replace()
        String str2 = "удаления всех пробелов из строки с помощью replace()";
        System.out.println(str2.replaceAll("\\s",""));
        //Найти позицию подстроки “Java” в строке “I like Java!!!”
        String str3 = "I like Java!!!I like Java!!!";
        System.out.println(str3.indexOf("Java"));
        System.out.println();
        //Напишите метод, заменяющий в строке каждое второе вхождение a на X
        int cnt=0;
        char arrCh[]=str3.toCharArray();
        for (int i = 0; i < str3.length(); i++) {
            if(arrCh[i]=='a'){
                cnt++;
                if(cnt%2==0&&cnt!=0)
                {
                    arrCh[i]='X';
                }
            }
        }
        for (int i = 0; i <arrCh.length ; i++) {
            System.out.print(arrCh[i]);
        }





    }
}
