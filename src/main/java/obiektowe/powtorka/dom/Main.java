package obiektowe.powtorka.dom;

public class Main {

    static Okno[] okna = {
            new Okno(),
            new Okno(),
            new Okno(),
            new Okno()

    };

    public static void main(String[] args) {

        for (Okno okno : okna) {
            okno.otworzOkno();
        }

        Lozko lozko = new Lozko(6);

        Pokoj pokoj = new Pokoj();
        Pokoj pokoj1 = new Pokoj(lozko, okna);

        System.out.println(pokoj);
        System.out.println(pokoj1);

        Pokoj pokoje[] = new Pokoj[]{pokoj,pokoj1};

        Dom dom = new Dom(pokoje);

        System.out.println(dom);

        dom.sprzatajPokoje();

        System.out.println(dom);





    }


}
