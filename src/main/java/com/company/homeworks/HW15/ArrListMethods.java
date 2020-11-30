package com.company.homeworks.HW15;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrListMethods {
    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();
        listA.add("a");
        listA.add("b");
        listA.add("c");
        listA.add("d");
        listA.add("e");


        List<String> listB = new ArrayList<>();
        listB.add("d");
        listB.add("b");
        listB.add("c");
        listB.add("a");
        listB.add("e");

        System.out.println(listComparator(listA, listB));
        System.out.println(concatListsToUniqueList(listA, listB));
    }


    public static List<String> concatListsToUniqueList(List<String> a, List<String> b) {
        a.addAll(b);
        a=unique(a);
        return a;
    }


    public static boolean listComparator(List<String> a, List<String> b) {
        if (a.size() == b.size()) {
            a = unique(a);
            b = unique(b);
            if(a.size() == b.size()){
                for (int i = 0; i < b.size(); i++) {
                    if (a.contains(b.get(i))){
                            continue;
                    } else {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
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
