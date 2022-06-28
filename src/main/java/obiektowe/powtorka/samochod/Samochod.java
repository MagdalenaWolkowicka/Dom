package obiektowe.powtorka.samochod;

public class Samochod {

    String brand;
    private int mileage;
    private int mileageToNextService = 20000;

    public Samochod(String marka, int mileage) {
        this.brand = marka;
        this.mileage = mileage;
    }

    public Samochod() {
    }

    public void printBrandAndMileage() {
        System.out.println("Marka " + brand + " Przebieg " + mileage);
    }

    public int increaseMileage(int distance) {
        return mileage + distance;
    }

    public int printNumberOfKmToInspection() {
        return mileageToNextService - (mileage % mileageToNextService);
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", mileageReview=" + mileageToNextService +
                '}';
    }

    /////// gettery i settery ///////////////////////////////////

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
