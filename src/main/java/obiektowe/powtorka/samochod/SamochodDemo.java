package obiektowe.powtorka.samochod;

public class SamochodDemo {

    static Samochod[] samochody = {
            new Samochod("Opel", 150000),
            new Samochod("Fiat", 400000),
            new Samochod("Skoda", 170000),
            new Samochod("Toyota", 200000),
            new Samochod("Opel", 250000)};


    public static void main(String[] args) {
        for (Samochod samochod : samochody) {
            samochod.printBrandAndMileage();
            int increasedMileage = samochod.increaseMileage(2000);
            System.out.println(increasedMileage);
            int numberOfKmToNextInspection = samochod.printNumberOfKmToInspection();
            System.out.println(numberOfKmToNextInspection);
        }


    }
}