package obiektowe.powtorka.carWorkshop;

public class Main {

    public static CarWheel[] carWheels = {
            new CarWheel(456),
            new CarWheel(455),
            new CarWheel(679),
            new CarWheel(678)
    };

    public static void printWheels(CarWheel[] carWheels) {
        for (CarWheel carWheel : carWheels) {
            System.out.println(carWheel);
        }
    }

    public static void main(String[] args) {

        Car car = new Car(carWheels);
        printWheels(carWheels);

        car.breakTheWheel();
        printWheels(carWheels);

        CarWorkshop carWorkshop = new CarWorkshop(car);

        Receipt receipt = carWorkshop.repairWheel(carWheels);
        System.out.println(receipt);

        printWheels(carWheels);


    }
}
