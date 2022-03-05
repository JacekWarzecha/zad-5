package pl.devopsi.akademia01;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("                   ZAD_1                            ");
                         //Stwórz zmienne i przypisz do nich wartości
                         //"val_integer typu integer z wartością 250
                         //"val_string typu String z wartością “Akademia jest super
                         //val_double typu zmiennoprzecinkowej z wartością 1.234555
                         //Wyświetl wszystkie zmienne na konsoli w postaci “Zmienna X ma wartosc Y"


        int val_integer = 250;
        double val_double = 1.234555;
        String val_string = "Akademia jest super!";

        System.out.println("val_integer -->" + val_integer);
        System.out.println("val_double -->" + val_double);
        System.out.println("val_string -->" + val_string);





        System.out.println("                  ZAD_2                             ");
                        //Zadeklaruj tablice 10 liczb typu int i przeiteruj po niej od indexu 0 do 19
                        //(od 1 do 20). W czasie iteracji sprawdź czy dana liczba jest parzysta
                        //(liczba%2==0), jeśli tak to wyświetla napis “Liczba X jest parzysta”,
                        // gdzie X to dana liczba, w przeciwnym wypadku wyświetl sama liczbe.

        int[] tab1 = new int[20];
        tab1[0] = 10;
        tab1[1] = 20;
        tab1[2] = 55;
        tab1[3] = 40;
        tab1[4] = 50;
        tab1[5] = 77;
        tab1[6] = 70;
        tab1[7] = 80;
        tab1[8] = 97;
        tab1[9] = 100;

        for (int i = 0; i <= 9; i++) {
            if (tab1[i] % 2 == 0) {
                System.out.println("Liczba " + tab1[i] + " jest parzysta");
            } else {
                System.out.println(tab1[i]);
            }
        }





        System.out.println("                           ZAD_3                            ");
                            //Używając pętli while, zrób sumę liczb od 1 do 500 i ją wyświetl.
        int s = 0;
        boolean isReady2 = true;
        int sum = 0;
        while (isReady2) {
            sum = sum + s++;
            if (s == 501) {
                isReady2 = false;
                System.out.println(sum);
            }
        }





        System.out.println("                           ZAD_4                            ");
                            //Napisz program, który obliczy średnia liczb z tablicy int
                            //i na jej podstawie wystawi ocenę (char) (A >=4, B >=3 i <4, C < 3),
                            //następnie używając switch wyświetla odpowiedni komunikat
                            //w zależności od oceny (A=Super, B=Srednio, C=Slabo, Domsylnie= cos nie tak…)

        double[] marks = {1, 2, 3, 4, 5};
        double sum2 = 0.0;
        double quantity = marks.length;

        for (int i2 = 0; i2 < marks.length; i2++) {
            sum2 += marks[i2];
        }

        double avgmark = sum2 / quantity;

        switch (getChar(avgmark)) {
            case 'A':
                System.out.println("Super");
                break;
            case 'B':
                System.out.println("Średnio");
                break;
            case 'C':
                System.out.println("Słabo");
                break;
            default:
                System.out.println("Coś nie tak..");
        }




        System.out.println("                           ZAD_5                            ");
                        //Stwórz funkcje static pod funjcją main, która będzie pobierać tablicę typu double
                        //i zwraca zmodyfikowaną tablicę bezwzględną)

        double[] table5 = {2.5, -3, 12, -88.6};

        Main.getDouble(table5.length);

        for(int i=0; i< table5.length; i++){
            System.out.println(Main.getDouble(table5[i]));
        }







        System.out.println("                           ZAD_6                            ");
                            //Stwórz funkcje static pod funkcją main, która będzie pobierać imię(String)
                            //i zwracać typ enum MEN, WOMEN w zależności od tego czy imie jest męskie czy nie


        String names = "Iza";

        Main.getGender(names);
        System.out.println(Main.getGender(names));

    }





    public static char getChar(double avgmark) {
        if (avgmark >= 4) {
            return 'A';
        } else if (avgmark >= 3 && avgmark < 4) {
            return 'B';
        } else
            return 'C';
    }


    public static double getDouble(double table5){
        return Math.abs(table5);
    }



    public static Gender getGender(String names){
        if(names.endsWith("a")){
            return Gender.WOMEN;
        } else{
            return Gender.MAN;
        }
    }



}






