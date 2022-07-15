package obiektowe.powtorka.postOffice.service;

import obiektowe.powtorka.postOffice.model.Package;
import obiektowe.powtorka.postOffice.model.Person;
import obiektowe.powtorka.postOffice.model.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageService implements Countable, Visible {

    private List<Package> sentPackages = new ArrayList<>();
    private List<Package> allPackages = new ArrayList<>();

    public void sendPackage() {
        PostOffice postOffice = new PostOffice();
        Package newPackage = createPackage();
        double price = countPrice();
        double money = postOffice.pay(price);
        if (money < price) {
            System.out.println("Wysyłka kosztuje " + price + " zł.");
            System.out.println("Za mało kasy, nie udało się wysłać");

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


    private Package createPackage() {
        PostOffice postOffice = new PostOffice();
        List<Person> people = postOffice.askPersonInfo();
        return new Package(people.get(0), people.get(1), getPackageWeight(),  postOffice.isPriority());
    }

    private int getPackageWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę paczki");
        return scanner.nextInt();
    }

    public void displayLastSentPackage() {
        System.out.println(sentPackages.get(sentPackages.size() - 1));
    }


    public void displaySentPackages() {
        for (Package sentPackage : sentPackages) {
            System.out.println(sentPackage);
        }

    }

    @Override
    public double countPrice() {
        PostOffice postOffice = new PostOffice();
        int weight = getPackageWeight();
        boolean priority = postOffice.isPriority();
        double price = 0;
        if (weight < 500) {
            price = 5.0;
        } else if (weight >= 500 && weight < 1000) {
            price = 8.0;
        } else if (weight >= 1000 && weight < 2000) {
            price = 12.0;
        } else {
            price = 12.0 + (weight - 2000) / 1000;
        }
        if (priority) {
            price = price + price * 0.1;
        }
        return price;
    }

    @Override
    public void displayAll() {
        PostOffice postOffice = new PostOffice();
        if (!allPackages.isEmpty()) {
            for (Package allPackage : allPackages) {
                System.out.println(allPackage);
            }
        } else {
            postOffice.printNoDataToDisplay();
        }

    }
}
