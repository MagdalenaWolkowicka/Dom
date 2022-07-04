package obiektowe.powtorka.carWorkshop;

public class CarWorkshop {

    private final static double PRICE = 50;

    public CarWorkshop(Car car) {
    }

    public Receipt repairWheel(CarWheel[] wheels) {
        int count = 0;
        int price = 0;
        checkWheels(wheels);
        for (CarWheel wheel : wheels) {
            if (!wheel.isWheelWorking()) {
                wheel.setWheelWorking(true);
                price += 70;
                count++;
            }
        }
        return new Receipt("naprawa koła", count, price);
    }

    private void checkWheels(CarWheel[] wheels) {
        for (int i = 0; i < wheels.length; i++) {
            if (!wheels[i].isWheelWorking()) {
                System.out.println("Koło " + (i + 1) + " jest pęknięte :(");
            }
        }
    }
}

