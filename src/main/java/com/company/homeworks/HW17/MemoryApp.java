package com.company.homeworks.HW17;


import java.util.ArrayList;
import java.util.List;

public class MemoryApp {

    private static List<MemoryApp> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        while (true) {
            try {
                list.add(new MemoryApp());
            } catch (OutOfMemoryError e){
            e.printStackTrace();
            break;
            }
        }
        System.out.println(list.size());
    }
}
