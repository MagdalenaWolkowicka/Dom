package obiektowe.powtorka.osoba;

import java.util.Random;

public class OsobaDemo {

    public static void main(String[] args) {

        int liczba = 10;
        String text = new String("abc");
        Random random = new Random();
        int [] liczby = {1, 2, 3};

        Osoba osoba1 = new Osoba("Radek", 30);
//        osoba1.imie = "Radek";
//        osoba1.wiek = 30;

        Osoba osoba2 = new Osoba("Zofia", 25);
//        osoba2.imie = "Zofia";
//        osoba2.wiek = 25;

        osoba1.przywitajSie();
        osoba1.wyprawUrodziny();
        osoba1.przywitajSie();
        System.out.println();
        System.out.println(osoba1);
    }
}
