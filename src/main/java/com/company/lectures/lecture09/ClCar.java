package com.company.lectures.lecture09;

public class ClCar {
    private String name;
    private String model;
    private String year;
    private double price;
    public double costOfInshurence(){
        int year = Integer.parseInt(this.year);
        double insh = 0;
        if(year<2018){
            insh = this.price*0.1;
        }else{
            insh = this.price*0.2;
        }
       return insh;
    }

    public ClCar(String name, String model, String year, double price){
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ClCar{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
