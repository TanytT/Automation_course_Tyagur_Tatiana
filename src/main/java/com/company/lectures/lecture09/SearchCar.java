package com.company.lectures.lecture09;

public class SearchCar {
    public static void main(String[] args) {
        ClCar car1 = new ClCar("Honda","Insight","2011",12500);
        ClCar car2 = new ClCar("Tesla","Modal S", "2018",38900);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.costOfInshurence());
        System.out.println(car2.costOfInshurence());
    }
}
