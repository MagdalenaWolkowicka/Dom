package obiektowe.powtorka.postOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageService {

    private List<Package> sentPackages = new ArrayList<>();
    private List<Package> allPackages = new ArrayList<>();

    public void sendPackage() {
        PostOffice postOffice = new PostOffice();
        Package newPackage = createPackage();
        double price = newPackage.countPrice();
        double money = pay(price);
        if (money < price) {
            System.out.println("Wysyłka kosztuje " + price + " zł.");
            System.out.println("Za mało kasy, nie udało się wysłać");
            newPackage.setStatus(Status.DELETED);
            allPackages.add(newPackage);
            return;
        } else if (money == price) {
            newPackage.setStatus(Status.SENT);
            System.out.println("Paczka wysłana ;)");
        } else {
            newPackage.setStatus(Status.SENT);
            double restOfMoney = money - price;
            System.out.println("Wydaję " + restOfMoney + " zł reszty.");
        }
        if (newPackage.getStatus().equals(Status.SENT)) {
            postOffice.increaseTakings(price);
            sentPackages.add(newPackage);
        }
        allPackages.add(newPackage);
    }

    private double pay(double price) {
        System.out.println("Wysyłka kosztuje " + price + " zł. Zapłać");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private Package createPackage() {
        boolean priority = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nadawcę");
        String sender = scanner.nextLine();
        System.out.println("Podaj odbiorcę");
        String recipient = scanner.nextLine();
        System.out.println("Podaj wagę paczki");
        ;
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Priorytetowa? tak / nie");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equalsIgnoreCase("tak")) {
            priority = true;
        } else {
            priority = false;
        }
        return new Package(sender, recipient, weight, priority);
    }

    public void displaySentPackages() {
        for (Package sentPackage : sentPackages) {
            System.out.println(sentPackage);
        }

    }

    public void displayAllPackages() {
        for (Package allPackage : allPackages) {
            System.out.println(allPackage);
        }

    }
}
