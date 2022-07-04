package obiektowe.powtorka.kompozycja;

public class SerwisSpoldzielni {

    private Blok blok;

    public SerwisSpoldzielni(Blok blok) {
        this.blok = blok;
    }

    public void opaclCzynsz(int numerMieszkania) {
        Mieszkanie mieszkanie = blok.znajdzMieszkanie(numerMieszkania);
        if (mieszkanie == null) {
            return;
        }
        mieszkanie.oplac();
    }
}
