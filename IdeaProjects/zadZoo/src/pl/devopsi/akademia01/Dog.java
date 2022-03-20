package pl.devopsi.akademia01;

public class Dog extends Animal {
    private int dogsTail;
    private String dogsColor;

    public Dog(String name, int yearOfBirth, AnimalType kindOfAnimal, int dogsTail, String dogsColor){
        super(name,yearOfBirth,kindOfAnimal);
        this.dogsTail=dogsTail;
        this.dogsColor=dogsColor;
    }


    public void setDogsTail(int dogsTail){
        this.dogsTail=dogsTail;
    }

    public int getDogsTail(){
        return dogsTail;
    }

    public void setDogsColor(String dogsColor){
        this.dogsColor=dogsColor;
    }

    public String getDogsColor(){
        return dogsColor;
    }

    @Override
    public void sound() {
        System.out.println("HauhauHauhau");
    }
}
