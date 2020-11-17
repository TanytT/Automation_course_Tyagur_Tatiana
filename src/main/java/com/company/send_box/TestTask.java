package com.company.send_box;

public class TestTask {
    public static void main(String[] args) {

        System.out.println(areYouPlayingBanjo("Martin"));
        int [] val = {6, 7, 8, 7, 6, 6};
        System.out.println(minValue(val));

        System.out.println(cockroachSpeed(1.08));
        //System.out.println(Goals.totalGoals);

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

}
