package pl.devopsi.akademia01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Stwórz Zoo itd...

        System.out.println();
        System.out.println("Obiekty Animal i użycie metod:");


        Animal lizard = new Animal("Jaszczurka", 2019, AnimalType.REPTILE);
        Animal turtle = new Animal("Żółw", 2010, AnimalType.REPTILE);

        Animal toad = new Animal("Ropucha", 2015, AnimalType.AMPHIBIAN);
        Animal frog = new Animal("Żaba", 2016, AnimalType.AMPHIBIAN);

        Animal frog1 = new Animal("Żaba", 2016, AnimalType.AMPHIBIAN);


        if (toad.equals(frog1)) {
            System.out.println("Te obiekty są sobie równe");
        } else {
            System.out.println("Te obiekty NIE są sobie równe");
        }

        System.out.println(lizard);
        System.out.println(turtle);
        System.out.println(frog.getAgeOfAnimal());
        System.out.println(toad.getName());
        System.out.println(frog1.getKindOfAnimal());

        System.out.println();
        System.out.println("obiekt Zoo i metody");

        Zoo oursZoo = new Zoo("naszeZoo", 2018, new ArrayList<>());
        oursZoo.addAnimal(frog1);
        oursZoo.addAnimal(toad);


        oursZoo.showAnimals();
        System.out.println(oursZoo.countAnimals());
        System.out.println();

        oursZoo.showInfo();

        System.out.println();
        System.out.println("Praca na nowych obiektach");

        Animal crocodile = new Animal("Kokodyl", 2010, AnimalType.REPTILE);
        Animal fireSalamander = new Animal("Salamandra_plamista", 2012, AnimalType.AMPHIBIAN);

        crocodile.setName("Skurczybyk");
        crocodile.setYearOfBirth(2014);
        System.out.println(crocodile);

        System.out.println(fireSalamander.getAgeOfAnimal());

        if (crocodile.equals(fireSalamander)) {
            System.out.println("są równe!");
        } else {
            System.out.println("nie są równe@!");
        }

        System.out.println(fireSalamander.getKindOfAnimal());

        Zoo theNewstZoo = new Zoo("NajnowszeZoo!", 2021, new ArrayList<>());
        theNewstZoo.addAnimal(crocodile);
        theNewstZoo.addAnimal(fireSalamander);

        theNewstZoo.showAnimals();
        System.out.println(theNewstZoo.countAnimals());
        System.out.println(theNewstZoo.getAnimals());
        theNewstZoo.showInfo();

        System.out.println("Tworzę obiekty klas snake, dog, fish");

        Snake bigSnake = new Snake("DużyWąż", 2009, AnimalType.REPTILE, 15.5, 0.50);
        Snake smallSnake = new Snake("MałyWąż", 2021, AnimalType.REPTILE, 1.5, 0.1);

        Dog bigDog = new Dog("Cziłała", 2020, AnimalType.MAMMAL, 1, "reeed");
        Dog smallDog = new Dog("Husky", 2017, AnimalType.MAMMAL, 2, "yellow");

        Fish bifFish = new Fish("Okoń", 2019, AnimalType.FISH, 1050, 8);
        Fish smallFish = new Fish("Sum", 2022, AnimalType.FISH, 3050, 10);


        List<Speakable> animals = new ArrayList<>();
        animals.add(smallDog);
        animals.add(smallFish);
        animals.add(bigSnake);

        System.out.println();
        System.out.println("Pętla po animalsach z wywołaniem metody sound na każdym obiekcie:::");
        animals.forEach(Speakable::sound);



        //Stwórz obiekt takiej klasy wraz z liczbami [-1,2,50,100] przekazanymi w konstruktorze.
        //Stwórz odpowiednie interfaces zgodnie z metodami definiującymi operację dodawnia , liczenia
        //średniej i wyświetlania liczby większej od 2.
        //Stwórz odpowiednie lambdy do wszystich metod i zademonstruj ich działanie na zasadzie tego
        //co dana funkcja zrobi po potrzymaniu obiektu lambdy.

        System.out.println("  ");
        System.out.println("Lambdy Panie");

        Numbers numbers = new Numbers(new int[]{-1, 2, 50, 100});

        Lambda1 lambda1 = (int[] numbers1) -> Arrays.stream(numbers1).sum();
        System.out.println("Operacja dodawania -->" + " " + numbers.add(lambda1));

        Lambda2 lambda2 = (int[] numbers2) -> Arrays.stream(numbers2).sum() / numbers2.length;
        System.out.println("Operacja liczenia średniej-->"+ " " + numbers.avg(lambda2));

        Lambda3 lambda3 = (int[] numbers3) -> {
            for (int i = 0; i < numbers3.length; i++) {
                if (numbers3[i] > 2)
                    System.out.println("Operacja wyświetlania liczb większych od 2-->"+ "  " + numbers3[i]);
            }
            return numbers3.length;
        };

        numbers.show(lambda3);

    }

}
