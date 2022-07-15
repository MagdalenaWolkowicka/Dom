package obiektowe.powtorka.postOffice;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String menuOptionsToPrint;

    public Menu() {
        List<String> menuOptions = new ArrayList<>();
        menuOptions.add("\n -----Menu-----");
        menuOptions.add("1. Nadaj paczkę");
        menuOptions.add("2. Wyświetl wysłane paczki");
        menuOptions.add("3. Wyświelt wszystkie paczki");
        menuOptions.add("4. Nadaj list");
        menuOptions.add("5. Wyświelt nadane listy");
        menuOptions.add("6. Wyświetl wszystkie listy");
        menuOptions.add("7. Wyświelt ostatnią wysłaną paczkę");
        menuOptions.add("8. Wyświetl utarg");
        menuOptions.add("9.Wyślij listonosza");
        menuOptions.add("0. Wyjdź");
        menuOptionsToPrint = String.join("\n", menuOptions);
    }

    public String getMenuOptionsToPrint() {
        return menuOptionsToPrint;
    }
}
