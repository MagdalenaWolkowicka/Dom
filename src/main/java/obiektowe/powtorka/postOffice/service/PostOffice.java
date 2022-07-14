package obiektowe.powtorka.postOffice.service;

import obiektowe.powtorka.postOffice.Menu;
import obiektowe.powtorka.postOffice.model.Address;
import obiektowe.powtorka.postOffice.model.Package;
import obiektowe.powtorka.postOffice.model.Person;
import obiektowe.powtorka.postOffice.service.PackageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostOffice {

    private boolean exitPostOffixe = false;
    private PackageService packageService = new PackageService();
    private static double takings;

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
                packageService.sendPackage();
                break;
            case "2":
                packageService.displaySentPackages();
                break;
            case "3":
                packageService.displayAllPackages();
                break;
            case "4":
                System.out.println(getTakings());
                break;
            case "0":
                exitPostOffixe = true;
                break;
            default:
                System.out.println("Błędny wybór");
                break;
        }
    }

    public List<Person> askPersonInfo() {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("DANE NADAWCY: ");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                System.out.println("DANE ODBIORCY: ");
            }
            System.out.println("Podaj imię");
            String name = scanner.nextLine();
            System.out.println("Podaj nazwisko");
            String surname = scanner.nextLine();
            System.out.println("Podaj nazwę miasta");
            String city = scanner.nextLine();
            System.out.println("Podaj nazwę ulicy");
            String street = scanner.nextLine();
            System.out.println("Podaj numer domu");
            int houseNumber = scanner.nextInt();
            System.out.println("Podaj kod pocztowy");
            String zipCode = scanner.nextLine();
            Person person = new Person(name, surname, new Address(city, street, houseNumber, zipCode));
        }
        return people;
    }

    public boolean isPriority() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Priorytet? tak / nie");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equalsIgnoreCase("tak")) {
            return true;
        } else {
            return false;
        }
    }

    public double pay(double price) {
        System.out.println("Wysyłka kosztuje " + price + " zł. Zapłać");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void increaseTakings(double price) {
        this.takings = takings + price;
    }

    public double getTakings() {
        return takings;
    }

    public void setTakings(double takings) {
        this.takings = takings;
    }

    public void printNoDataToDisplay() {
        System.out.println("Brak danych od wyświetlenia");
    }
}
