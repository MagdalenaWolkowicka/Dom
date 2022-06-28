package obiektowe.powtorka.linia;

public class LiniaDemo {

    public static void main(String[] args) {

        Linia linia1 = new Linia(3, "!");
        Linia linia2 = new Linia(4, "@");
        Linia linia3 = new Linia(5, "$");

        Linia linia = new Linia();
        linia.drukujLinie(linia1);

    }


}