package obiektowe.powtorka.postOffice;

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

    public void increaseTakings(double price) {
        this.takings = takings + price;
    }

    public double getTakings() {
        return takings;
    }

    public void setTakings(double takings) {
        this.takings = takings;
    }
}
