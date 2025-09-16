package ParkingLotSystem;
import java.util.*;
public class Floor {
    private final int number;
    private List<ParkingSpot> parkingSpots;
    public Floor(int number, List<ParkingSpot> spots) {
        this.number = number;
        this.parkingSpots = spots;
    }
    public int getNumber() {
        return number;
    }

    public List<ParkingSpot> getParkingSpots() {return parkingSpots;}

}
