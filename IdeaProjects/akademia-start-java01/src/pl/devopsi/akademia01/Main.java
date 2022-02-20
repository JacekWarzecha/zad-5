package pl.devopsi.akademia01;

public class Main {

    public static void main(String[] args) {

        System.out.println("                   ZAD_1                            ");


        int val_integer = 250;
        double val_double = 1.234555;
        String val_string = "Akademia jest super!";

        System.out.println("val_integer -->" + val_integer);
        System.out.println("val_double -->" + val_double);
        System.out.println("val_string -->" + val_string);


        System.out.println("                  ZAD_2                             ");


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
    }

        public static char getChar ( double avg){
            if (avg >= 4) {
                return 'A';
            } else if (avg >= 3 && avg <4) {
                return 'B';
            } else
                return 'C';
    }
}

