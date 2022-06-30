package obiektowe.powtorka.dom;

import java.util.Arrays;

public class Pokoj {

    private Lozko lozko;
    private Okno[] okna;

    public Pokoj(Lozko lozko, Okno[] okna) {
        this.lozko = lozko;
        this.okna = okna;
    }

    public Pokoj() {
        okna = new Okno[2];
        lozko = new Lozko(5);
        okna[0] = new Okno();
        okna[1] = new Okno();
    }

    public void posprzatajPokoj() {
        for (Okno okno : okna) {
            okno.otworzOkno();
        }
        zmienPosiciel();
    }

    private void zmienPosiciel() {
        lozko.setDniOdZmianyPoscieli(0);
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "lozko=" + lozko +
                ", okna=" + Arrays.toString(okna) +
                '}';
    }
}
