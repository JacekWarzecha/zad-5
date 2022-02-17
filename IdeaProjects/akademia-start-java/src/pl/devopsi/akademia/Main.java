package pl.devopsi.akademia;

public class Main {

    public static void main(String[] args) {


        System.out.println(".....................zad 1.....................");


        int val_integer = 250;
        double val_double = 1.234555;
        String val_string = "Akademia jest super!";

        System.out.println("val_integer -->" + val_integer);
        System.out.println("val_double -->" + val_double);
        System.out.println("val_string -->" + val_string);




        System.out.println(".....................zad2....................................");

        //...............jeśli chodzi o zad 2, to nie wiem dlaczego iterujemy do 20 jeśli mamy do 10 w tablicy..


        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int z = 0;
        boolean isReady = true;

        while (isReady) {
            if (z % 2 == 0) {
                System.out.println("Liczba " + z + " jest parzysta");
            } else {
                System.out.println(z);
            }
            if (z == 20) {
                isReady = false;
            }
            z = z + 1;
        }


        System.out.println("......................zad3.................................");


        int s = 0;
        boolean isReady2 = true;
        int suma = 0;
        while(isReady2){
            suma = suma + s++;
            if (s == 501){
                isReady2=false;
                System.out.println(suma);
            }
        }


        System.out.println("...................zad4..................................");

        int suma2 = 0;
        int ilośćliczbTablicy = tab1.length;

        for (int i = 0; i < tab1.length; i++){
            suma2 += tab1[i];
        }
        int średniaLiczbTablicy = suma2 / ilośćliczbTablicy;

//..    if (średniaLiczbTablicy>=4){
//            System.out.println("A");
//
//        } else if (średniaLiczbTablicy>=3){
//            System.out.println("B");
//
//        } else {
//            System.out.println("C");
//        }
// chciałem dać jeszcze tutaj if, żeby udowodnić, że system sam oceni tą średnią, a ponadto myślałem,
// że w nazwie zmiennej char zamiast 'w' będę mógł dać 'średniaLiczbTablciy' przez co system sam by
// by pobrał tą średnią i ją ocenił, ale jest komunikat, że średnia ta już została zdefiniowana..
// nie do końca jeszcze to wszystko łapię..


        char w = 'A';
        switch (w){
            case'A':
                System.out.println("Super");
                break;
            case'B':
                System.out.println("Srednio");
                break;
            case'C':
                System.out.println("Slabo");
                break;
            default:
                System.out.println("cos nie tak...");

        }

    }
}

