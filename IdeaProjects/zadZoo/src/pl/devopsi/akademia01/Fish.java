package pl.devopsi.akademia01;

public class Fish extends Animal {
    private int fishScale;
    private int fishMustache;


    public Fish (String name, int yearOfBirth, AnimalType kindOfAnimal, int fishScale, int fishMustache){
        super(name, yearOfBirth,kindOfAnimal);
        this.fishScale=fishScale;
        this.fishMustache=fishMustache;
    }

    public void setFishScale (int fishScale){
        this.fishScale=fishScale;
    }

    public int getFishScale(){
        return fishScale;
    }

    public void setFishMustache(int fishMustache){
        this.fishMustache=fishMustache;
    }

    public int getFishMustache(){
        return fishMustache;
    }

    @Override
    public void sound() {
        System.out.println("PlaskPlaskPlask");

    }
}
