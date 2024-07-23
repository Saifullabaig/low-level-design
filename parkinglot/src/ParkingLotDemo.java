import vehicletype.Car;
import vehicletype.MotorCycle;
import vehicletype.Truck;
import vehicletype.Vehicle;

public class ParkingLotDemo {
    public static void start(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABCD");
        Vehicle motor = new Car("XYZ");
        Vehicle truck = new Truck("jkl");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(motor);
        parkingLot.parkVehicle(truck);

        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(car);
        parkingLot.displayAvailability();
    }
}
