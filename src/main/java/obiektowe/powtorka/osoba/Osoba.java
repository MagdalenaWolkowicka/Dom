package obiektowe.powtorka.osoba;

import java.util.Random;

public class Osoba {

    String imie;
    int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }


    public Osoba() {
        imie = "Jan";

    }

    void przywitajSie() {
        System.out.println("Jestem " + imie + " mam " + wiek) ;
    }

    void wyprawUrodziny() {
        wiek++;
    }

    @Override
    public String toString() {
        return "Jestem " + imie + " mam " + wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }
}
