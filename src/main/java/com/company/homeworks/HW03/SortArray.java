package com.company.homeworks.HW03;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        int length = new Random().nextInt(25);
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("Array without sorting: ");
        System.out.println(Arrays.toString(arr));
        int min;
        for (int j = 1; j < length; j++) {
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {
                    min = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = min;
                }
            }
        }
        System.out.println("Array from min to max: ");
        System.out.println(Arrays.toString(arr));

    }
}
