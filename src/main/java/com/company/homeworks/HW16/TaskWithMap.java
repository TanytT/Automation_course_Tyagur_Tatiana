package com.company.homeworks.HW16;

import java.util.*;

public class TaskWithMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);
        System.out.println(duplicateIdentifier(list));

    }
    public static Map<Integer, Integer> duplicateIdentifier(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        int cnt=1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if(list.get(i).equals(list.get(j))){
                    cnt++;
                }
            }
            if(cnt>0) {
                map.put(list.get(i), cnt);
                cnt = 0;
            }
        }
        return map;
    }
}
