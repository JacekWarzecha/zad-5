package pl.devopsi.akademia01;

import java.util.Objects;

public class Animal implements Speakable {
    private String name;
    private int yearOfBirth;
    private AnimalType kindOfAnimal;

    public Animal(String name, int yearOfBirth, AnimalType kindOfAnimal){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
        this.kindOfAnimal=kindOfAnimal;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth= yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setKindOfAnimal(AnimalType kindOfAnimal){
        this.kindOfAnimal=kindOfAnimal;
    }
    public AnimalType getKindOfAnimal(){
        return kindOfAnimal;
    }
    @Override
    public String toString() {
        return getName() + getYearOfBirth() + getKindOfAnimal();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return yearOfBirth == animal.yearOfBirth && getName().equals(animal.getName()) && getKindOfAnimal().equals(animal.getKindOfAnimal());
    }
    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, getName(), getKindOfAnimal());
    }
    private static int CURRENT_YEAR=2022;
    public int getAgeOfAnimal() {
        return CURRENT_YEAR - yearOfBirth;
    }

    @Override
    public void sound() {
        System.out.println("Default brmbrm");
    }
}










