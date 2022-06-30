package obiektowe.powtorka.carWorkshop;

public class CarWheel {

    private int pressure;
    private boolean isWheelWorking = true;

    public CarWheel(int pressure) {
        this.pressure = pressure;
    }

    public boolean isWheelWorking() {
        return isWheelWorking;
    }

    public void setWheelWorking(boolean wheelWorking) {
        this.isWheelWorking = wheelWorking;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "pressure=" + pressure +
                ", isWheelWorking=" + isWheelWorking +
                '}';
    }
}
