package com.company.send_box;

import com.company.lectures.lecture06.Arrays;

public class TestTask {
    public static void main(String[] args) {
        int []array=new int[]{1};
        System.out.println(areYouPlayingBanjo("Martin"));
        int [] val = {6, 7, 8, 7, 6, 6};
        System.out.println(minValue(val));

        System.out.println(cockroachSpeed(1.08));
        System.out.println();
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[i-1]+1){
                System.out.println("Element="+array[i]);
            }
        }
        System.out.println(expressionsMatter(5,5,6));
        System.out.println(expressionsMatter1(5,5,6));
        System.out.println(expressionsMatter1(1,1,1));
        System.out.println(expressionsMatter2(5,5,6));
        System.out.println(expressionsMatter2(1,1,1));

        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        //System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"), false));
        String string = "1A2B3C4D5sE23.af";
        String res="";
        char arr[]=string.toCharArray();
        for(int j=0; j<arr.length;j++){
            if((int)arr[j]>=65&&(int)arr[j]<=90){
                arr[j]+=32;
            }else if((int)arr[j]>=97&&(int)arr[j]<=122){
                arr[j]-=32;
            }
            res+=arr[j];
        }

        System.out.println(res);

    }


    public static String areYouPlayingBanjo(String name) {
        if(name.toLowerCase().charAt(0)=='r')
            return name+" plays banjo";
        else return name+ " does not play banjo";
    }
    public static int minValue(int[] values){
        int tmp=0;
        for(int i=0; i<values.length; i++){
            for (int j = i+1; j < values.length; j++) {
                if(values[j]<values[i]){
                    tmp=values[i];
                    values[i] = values[j];
                    values[j]=tmp;
                }
            }
        }
        int numb []= new int[values.length];
        int cnt = 0;
        String str="";
        numb[cnt] = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i-1] != values[i]) {
                cnt++;
                numb[cnt] = values[i];
            }
          }
        for (int i = 0; i < numb.length; i++) {
            if(numb[i]!=0){
                str+=numb[i];
            }
        }
        return Integer.parseInt(str);
    }

    public static int cockroachSpeed(double x){
        System.out.println(x*1000.0/3600.0);
        return (int)(x*1000.0/3600.0);
    }
    public static int expressionsMatter(int a, int b, int c)
    {
        int max=a*(b+c);
        if(max<a*b*c){
            max=a*b*c;
            if(max<a+b+c){
                max=a+b+c;
            }
        }else if(max<a+b+c){
            max= a+b+c;
        }
        if(a+b*c<(a+b)*c){
            if(max<(a+b)*c){
                max=(a+b)*c;
            }
        }else if(max<a+b*c) {
            max=a+b*c;
        }
        return max;
    }
    public static int expressionsMatter1(int a, int b, int c)
    {

        int[] arr= {a*(b+c), a*b*c, a+b+c, (a+b)*c, a+b*c };
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    public static int expressionsMatter2(int a, int b, int c)
    {
         return Math.max(Math.max(Math.max(Math.max(a*(b+c),a*b*c),a+b+c),(a+b)*c),a+b*c);
    }

    public static String abbrevName(String name) {
        String [] res =name.split(" ");
        return res[0].substring(0,1).toUpperCase()+"."+res[1].substring(0,1).toUpperCase();
    }
    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(x)){
                return true;
            }
        }
        return false;
    }
    public static boolean check1(Object[] a, Object x) {
        for (Object s: a) {
            if(s.equals(a))
            return true;
        }
        return false;
    }
    public static String toAlternativeString(String string) {
        String res="";
        res=string.replaceAll("[a-z]","".toUpperCase());
        System.out.println(res);
      return res;
    }

}
