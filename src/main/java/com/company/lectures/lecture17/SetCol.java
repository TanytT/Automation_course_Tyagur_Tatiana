package com.company.lectures.lecture17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetCol {
    public static void main(String[] args) {
        List<String> a= new ArrayList<>();
        a.add("2");
        a.add("1");
        a.add("3");
        a.add("4");
        a.add("4");
        a.add("2");

        System.out.println(unique(a));
    }
    public static List<String> unique(List<String> a){
        Iterator<String> iterator = a.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            if(a.indexOf(item)!=a.lastIndexOf(item)){
                iterator.remove();
            }
        }
        return a;
    }
}
