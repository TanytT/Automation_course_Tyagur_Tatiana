package com.company.send_box;

public class ExOfTasks {
    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix";
        int cnt=1, cnt1=0;
        text = text.toLowerCase();
        int i=0;
        while(i<text.length()){
            for (int j = 1; j < text.length(); j++) {
                if(text.charAt(i)==text.charAt(j)){
                    cnt++;
                }
            }
            text = text.replace(""+text.charAt(i),"").trim();
            if(cnt>=2) {
                cnt1++;
            }
            cnt = 1;
        }
        System.out.println(cnt1);
        ////////////////////////////////////////////////////////////////////////
        int [] n={1,2,2};
        double sum=0;
        for (int k:n) {
            sum+=Math.pow(k,2);
        }
        System.out.println(sum);
        //////////////////////////////////////////////////////////////////////////
        System.out.println(isVacat(true,false));
        System.out.println(isVacat(true,true));
        System.out.println(isVacat(false,false));
        System.out.println(isVacat(false,false));
        ////////////////////////////////////////////////////////////////////////
        int [] arr1=new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};
        int sum1=0;
        for(int l:arr1){
            sum1+=l;
        }
        for (int m:arr2) {
            sum1+=m;
        }
        System.out.println(sum1);
        /////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////////////");
        int[] array=new int[]{3,1,2};
        int n1=2;
            for(int i1=0; i1<array.length;i1++){
                if(i1==n1){
                    System.out.println((int)Math.pow(array[i1],n1));
                    break;
                }else{
                    System.out.println(-1);
                }
            }
        System.out.println("/////////////////////////////////////////////");
        System.out.println(nthPower(array,2));
        System.out.println("/////////////////////////////////////////////////");
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));

    }
    public static boolean isVacat( boolean employed,boolean vacation){
        //return (employed==true&&vacation==false)?true:false;
        return employed&&!vacation;
    }
    public static int nthPower(int[] array, int n) {

        return (n<array.length&&n>=0)?(int)Math.pow(array[n],n):-1;
    }
    public static String warnTheSheep(String[] array) {
        int numb=0;
        if(array[array.length-1]=="wolf"){
            return "Pls go away and stop eating my sheep";
        }
        for (int r = array.length-2; r >=0; r--) {
            if(array[r]=="wolf"){
                numb=array.length-r-1;
            }
        }
        return "Oi! Sheep number "+numb+"! You are about to be eaten by a wolf!";
    }
}
