interface ElectricVehicle {

    void charge();
    void batteryLevel();
}

class ElectricCar implements ElectricVehicle {
    public void charge() {
        System.out.println("Car is charging...");
    }
    public void batteryLevel() {
        System.out.println("Battery level of vehicle is 87%...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar();

        ev.charge();
        ev.batteryLevel();
    }

}