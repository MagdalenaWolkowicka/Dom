package obiektowe.powtorka.carWorkshop;

import java.util.Random;

public class Car {

    public Car(CarWheel[] carWheels) {
    }

    public void breakOneWheel() {
        Random random = new Random();
        int brokenWheel = random.nextInt(4);
        Main.carWheels[brokenWheel].doFlatWheel();
    }

    public void breakTheWheel() {
        Random random = new Random();
        int count = random.nextInt(2) + 1;

        for (int i = 0; i < count; i++) {
            int brokenWheel = random.nextInt(4);
            //Main.carWheels[brokenWheel].setWheelWorking(false);
            Main.carWheels[brokenWheel].doFlatWheel();

            System.out.println("Koło " + (brokenWheel + 1) + " złapało gumę :(");
        }

    }

}
