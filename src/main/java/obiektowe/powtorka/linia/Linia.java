package obiektowe.powtorka.linia;

public class Linia {
    private int dlugosc;
    private String wypelnienie;

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    public Linia() {
    }

    @Override
    public String toString() {
        return "Linia{" +
                "dlugosc=" + dlugosc +
                ", wypelnienie='" + wypelnienie + '\'' +
                '}';
    }

    public void drukujLinie(Linia linia) {
        for (int i = 0; i < linia.dlugosc; i++) {
            System.out.print(linia.wypelnienie);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Linia[] linie = new Linia[]{
                new Linia(5, "!"),
                new Linia(15, "@"),
                new Linia(8, "$")

        };

        Linia linia = new Linia();

        for (int i = 0; i < linie.length; i++) {
            linia.drukujLinie(linie[i]);
        }
    }

    /////// gettery i settery ///////////////////////////////////

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getWypelnienie() {
        return wypelnienie;
    }

    public void setWypelnienie(String wypelnienie) {
        this.wypelnienie = wypelnienie;
    }
}