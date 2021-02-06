package com.company.send_box.Inheritance;


import java.util.Objects;

public class Cat extends Animal implements Runable{
    private String color;
    private String coatLen;


    public Cat(){
        System.out.println("I am a cat");
    }

    public Cat(String name, String type, int age,String color, String coatLen){
        super(name,type,age);
        this.coatLen=coatLen;
        this.color = color;
    }
    public Cat(String name,String type, int age){
        super(name, type, age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Lesya", "Seamsk", 2,"black","3 sm");
        Cat cat1 = new Cat("Myrka", "Seam", 2);
        Cat cat2 = new Cat("Myrka", "Seam", 2);
        Cat cat3= new Cat();
        System.out.println(cat);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode()==cat2.hashCode());

    }

    public void run(){
        System.out.println("Cats run");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(getClass()!=o.getClass()) return false;
        return this.getName().equals(((Cat) o).getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.getName(),this.getType(),this.getAge());
    }

    @Override
    public void voice(){
        System.out.println("Myaw!");
    }

  @Override
    public String toString(){
        return super.toString()+" Cat: color = "+ color+ ", coat length = "+ coatLen;
    }

    public String getColor(){
        return color;
    }
}
