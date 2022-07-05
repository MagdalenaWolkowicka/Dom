package obiektowe.powtorka.postOffice;

import java.util.Scanner;

public class PostOffice {
    private boolean exitPostOffixe = false;

    public void start() {
        System.out.println("Witamy na poczcie");
        Menu menu = new Menu();
        exitPostOffixe = false;
        while (!exitPostOffixe) {
            System.out.println(menu.getMenuOptionsToPrint());
            actionMenu();
        }

    }

    private void actionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                break;
            case "2":
                break;
            case "0":
                exitPostOffixe = true;
                break;
            default:
                System.out.println("Błędny wybór");
                break;
        }
    }

    public void sendPackage(Package newPackage, double money) {
        double price = newPackage.countPrice();
        if (money < price) {
            System.out.println("Wysyłka kosztuje " + price + " zł.");
            System.out.println("Za mało kasy, nie udało się wysłać");
            return;
        } else if (money == price) {
            newPackage.setStatus(Status.ACCEPTED);
            System.out.println("Paczka wysłana ;)");
        } else  {
            newPackage.setStatus(Status.ACCEPTED);
            double restOfMoney = money - price;
            System.out.println("Wydaję " + restOfMoney + " zł reszty.");
        }



    }


}
