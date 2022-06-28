package obiektowe.powtorka.dom;

public class Pokoj {

    private Lozko lozko;
    private Okno[] okna = new Okno[2];

    public Pokoj(Lozko lozko, Okno[] okna) {
        this.lozko = lozko;
        this.okna = okna;
    }

    public Pokoj() {
        okna = new Okno[2];
        lozko = new Lozko(5);
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


}
