package com.company.homeworks.HW32;

public class NumbersOperations {

    public int secondMaxValue(int[] arr){
        int max=-1;
        int max2=-1;
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        return max2;
    }

    public boolean isPrimeNumb(int numb){
        boolean fl =true;
        for(int i=2; i<numb; i++) {
            if (numb % i ==0){
                fl=false;
            }
        }
        return fl;
    }
}
