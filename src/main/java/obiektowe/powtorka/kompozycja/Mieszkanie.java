package obiektowe.powtorka.kompozycja;

public class Mieszkanie {

    private  boolean oplacono;

    private int numer;

    public Mieszkanie(boolean oplacono, int numer) {
        this.oplacono = oplacono;
        this.numer = numer;
    }

    public Mieszkanie(int numer) {
        this.numer = numer;
    }
}
