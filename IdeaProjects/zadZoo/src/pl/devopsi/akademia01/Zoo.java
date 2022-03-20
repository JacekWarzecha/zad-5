package pl.devopsi.akademia01;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private int yearOfEstablishment;
    private List<Animal>animals;

    public Zoo(String name, int yearOfEstablishment, List<Animal>animals){
        this.name=name;
        this.yearOfEstablishment=yearOfEstablishment;
        this.animals=animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public void showAnimals(){
        for(int i=0; i<2;i++){
            System.out.println(getAnimals());
        }
    }

    public int countAnimals(){
        return animals.size();
    }

    private double avgAge(){
        int ageSum = 0;
        for(Animal animals: animals){
            ageSum = ageSum + animals.getAgeOfAnimal();
        }
        return ageSum/this.countAnimals();
    }

    public void showInfo(){
        System.out.println("średni wiek zwierząt-->" + avgAge() + "   " +"nazwa-->" +this.name + "   " +"rok założenia-->" +this.yearOfEstablishment);
    }



}
