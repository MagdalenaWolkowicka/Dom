package obiektowe.powtorka.postOffice;


public class PostOfficeDemo {

    static Package[] packagesTable100 = new Package[100];


    public static void main(String[] args) {

        // Poczta part 1

        Package p1 = new Package();
        Package p2 = new Package();
        Package p3 = null;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        double price1 = p1.countPrice();
        System.out.println(price1);
        double price2 = p2.countPrice();
        System.out.println(price2);
        p3 = p2;
        double price3 = p3.countPrice();
        System.out.println(price3);

        // Poczta part 2

        Package[] packagesTable3 = new Package[]{new Package("Ala", "Franek", 6000),
                new Package("Zosia", "Kasia", 7000), new Package("Ola", "Bartek", 5000)};
        System.out.println(packagesTable3[0]);

        for (int i = 0; i < packagesTable100.length; i++) {
            packagesTable100[i] = new Package();
        }
        for (Package aPackage : packagesTable100) {
            System.out.println(aPackage);
        }
        double allPackagePrice = 0;
        for (Package aPackage : packagesTable100) {
            allPackagePrice += aPackage.countPrice();
        }
        System.out.println(allPackagePrice);


    }

}
