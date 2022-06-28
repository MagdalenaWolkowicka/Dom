package obiektowe.powtorka.dom;

public class Lozko {

    private int dniOdZmianyPoscieli;

    public Lozko(int dniOdZmianyPoscieli) {
        this.dniOdZmianyPoscieli = dniOdZmianyPoscieli;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "dniOdZmianyPoscieli=" + dniOdZmianyPoscieli +
                '}';
    }

    public void setDniOdZmianyPoscieli(int dniOdZmianyPoscieli) {
        this.dniOdZmianyPoscieli = dniOdZmianyPoscieli;
    }
}
