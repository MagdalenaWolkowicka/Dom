package obiektowe.powtorka.dom;

import java.util.Arrays;

public class Dom {

    private Pokoj[] pokoje;

    public Dom(Pokoj[] pokoje) {
        this.pokoje = pokoje;
    }

    public void sprzatajPokoje() {
        for (Pokoj pokoj : pokoje) {
            pokoj.posprzatajPokoj();
        }

    }

    @Override
    public String toString() {
        return "Dom{" +
                "pokoje=" + Arrays.toString(pokoje) +
                '}';
    }
}
