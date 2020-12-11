package com.company.homeworks.HW18;

public class Pet {

    private final String name;
    private final String type;
    private final Integer age;
    private Double weight;

    public Pet(String name, String type, Integer age, Double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
    public Pet setWeight(Pet pet,Double newWeight) {
        pet.weight = newWeight;
        return pet;
    }

    public Pet whoYounger(Pet pet1, Pet pet2 ){
        if((pet2 == null)||(pet1==null)){
            return null;
        }
        return (pet1.age > pet2.age) ? pet2: pet1;
    }

    public boolean hasName(Pet [] pet, String name){
        for (Pet i : pet) {
            if(i.name.equals(name)){
                return true;
            }
        }
        return false;
    }

}
