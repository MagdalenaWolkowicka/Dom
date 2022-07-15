package obiektowe.powtorka.postOffice.service;

import obiektowe.powtorka.postOffice.controller.PostOffice;
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
        double price = countPrice(newPackage.isPriority());
        double money = postOffice.pay(price);
        if (money < price) {
            postOffice.printShippingCost(price);
            postOffice.printNotEnoughMoney();
            allPackages.add(newPackage);
            return;
        } else if (money == price) {
            newPackage.setStatus(Status.SENT);
            postOffice.printSent();
        } else {
            newPackage.setStatus(Status.SENT);
            double restOfMoney = Math.round((money - price) * 100);
            restOfMoney = restOfMoney / 100;
            postOffice.printGiveRestOfMoney(restOfMoney);
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
        return new Package(people.get(0), people.get(1), postOffice.isPriority());
    }

    private int getPackageWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę paczki");
        return scanner.nextInt();
    }

    public void displayLastSentPackage() {
        PostOffice postOffice = new PostOffice();
        if (!sentPackages.isEmpty()) {
            System.out.println(sentPackages.get(sentPackages.size() - 1));
        } else {
            postOffice.printNoDataToDisplay();
        }
    }

    public void displaySentPackages() {
        PostOffice postOffice = new PostOffice();
        if (!sentPackages.isEmpty()) {
            for (Package sentPackage : sentPackages) {
                System.out.println(sentPackage);
            }
        } else {
            postOffice.printNoDataToDisplay();
        }
    }

    @Override
    public double countPrice(boolean priority) {
        int weight = getPackageWeight();
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
