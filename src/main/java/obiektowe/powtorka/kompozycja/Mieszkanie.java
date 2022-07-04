package obiektowe.powtorka.kompozycja;

public class Mieszkanie {

    private  boolean oplacono;
    private final int numer;

    public Mieszkanie(boolean oplacono, int numer) {
        this.oplacono = oplacono;
        this.numer = numer;
    }

    public Mieszkanie(int numer) {
        this.numer = numer;
    }

    public void oplac() {
        oplacono = true;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "oplacono=" + oplacono +
                ", numer=" + numer +
                '}';
    }

    public int getNumer() {
        return numer;
    }
}
