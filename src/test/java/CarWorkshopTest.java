import obiektowe.powtorka.carWorkshop.Car;
import obiektowe.powtorka.carWorkshop.CarWheel;
import obiektowe.powtorka.carWorkshop.CarWorkshop;
import obiektowe.powtorka.carWorkshop.Receipt;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarWorkshopTest {

    @Test
    public void repairWheels() {
        //given
        CarWheel carWheel1 = new CarWheel(2);
        CarWheel carWheel2 = new CarWheel(2);
        CarWheel carWheel3 = new CarWheel(2);
        CarWheel carWheel4 = new CarWheel(2);
        CarWheel[] carWheels = {carWheel1, carWheel2, carWheel3, carWheel4};
        Car car = new Car(carWheels);
        car.breakTheWheel();
        CarWorkshop carWorkshop = new CarWorkshop(car);

        //when
        Receipt receipt = carWorkshop.repairWheel(carWheels);

        //then
        assertTrue(carWheel1.isWheelWorking());
        assertTrue(carWheel2.isWheelWorking());
        assertTrue(carWheel3.isWheelWorking());
        assertTrue(carWheel4.isWheelWorking());

    }


}
