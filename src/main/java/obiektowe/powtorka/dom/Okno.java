package obiektowe.powtorka.dom;

public class Okno {

    private boolean zamknięte = true;

    public Okno(boolean zamknięte) {
        this.zamknięte = zamknięte;
    }

    public Okno() {
    }

    public void otworzOkno() {
        zamknięte = false;
        System.out.println("Otwarte");
    }

    @Override
    public String toString() {
        return "Okno{" +
                "zamknięte=" + zamknięte +
                '}';
    }
}
