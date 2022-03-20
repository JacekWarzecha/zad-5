package pl.devopsi.akademia01;

public class Snake extends Animal {
    private double snakeLength;
    private double snakeThickness;

    public Snake(String name, int yearOfBirth, AnimalType kindOfAnimal, double snakeLength, double snakeThickness){
        super(name, yearOfBirth, kindOfAnimal);
        this.snakeLength=snakeLength;
        this.snakeThickness=snakeThickness;
    }

    public void setSnakeLength(double snakeLength){
        this.snakeLength=snakeLength;
    }

    public double getSnakeLength(){
        return snakeLength;
    }

    public void setSnakeThickness(double snakeThickness){
        this.snakeThickness=snakeThickness;
    }

    public double getSnakeThickness(){
        return snakeThickness;
    }

    @Override
    public void sound() {
        System.out.println("ssSSssSSsssSss");
    }
}
