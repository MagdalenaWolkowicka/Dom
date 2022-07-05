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
        newPackage = createPackage();
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

    private Package createPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nadawcę");
        String sender = scanner.nextLine();
        System.out.println("Podaj osbiercę");
        String recipient = scanner.nextLine();
        System.out.println("Podaj wagę paczki");;
        int weight = scanner.nextInt();
        System.out.println("Priorytetowa? Tak / nie");
        String yesOrNo = scanner.nextLine();
        if(yesOrNo.equals("Tak")) {
        }
        return new Package(sender, recipient, weight);
    }

    private void checkPriority() {

    }


}
