package ParkingLotSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> floor1Spots = Arrays.asList(new CarParkingSpot(1), new BikeParkingSpot(2), new TrukParkingSpot(3));
        Floor floor1 = new Floor(1, floor1Spots);

        List<Floor> floors = Arrays.asList(floor1);

        // Singleton instance of ParkingLot
        ParkingLot parkingLot = ParkingLot.getInstance(floors);

        // Vehicles
        Vehicle car = new Car("CAR123");
        Vehicle bike = new Bike("BIKE456");
        Vehicle truck = new Truck("TRUCK789");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        // Unpark vehicle
        parkingLot.unParkVehicle("CAR123");
        parkingLot.unParkVehicle("random");
        parkingLot.unParkVehicle("TRUCK789");
    }
}
