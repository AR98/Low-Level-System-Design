package ParkingLotSystem;

import java.util.*;

public class ParkingLot {
    private static  ParkingLot instance;
    private List<Floor> floors;
    private final Map<String, ParkingTicket> activeTickets;
    public static ParkingLot getInstance(List<Floor> floors) {
        if (instance == null) {
            instance = new ParkingLot(floors);
        }
        return instance;
    }
    private ParkingLot(List<Floor> floors) {
        this.floors = floors;
        this.activeTickets = new HashMap<>();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Floor floor: floors) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.isFree()) {
                    spot.parkVehicle(vehicle);

                    ParkingTicket ticket = TicketFactory.createParkingTicket(vehicle);
                    activeTickets.put(vehicle.getLicenseNumber(), ticket);

                    System.out.println("Vehicle " + vehicle.getLicenseNumber() + " parked at spot " + spot.getId());
                    return true;
                }
            }
        }
        System.out.println("Parking full for vehicle: " + vehicle.getLicenseNumber());
        return false;
    }

    public void unParkVehicle(String licenseNumber) {
        ParkingTicket ticket = activeTickets.get(licenseNumber);
        if(!activeTickets.containsKey(licenseNumber)) {
            System.out.println("Vehicle " + licenseNumber + " not found");
            return;
        }

        for(Floor floor: floors) {
            for(ParkingSpot spot: floor.getParkingSpots()) {
                if(!spot.isFree() && licenseNumber.equals(ticket.getVehicle().getLicenseNumber())) {
                    spot.releaseVehicle();
                    double price = ticket.calculatePricing();
                    System.out.println("Vehicle " + licenseNumber + " unparked. Total price: ₹" + price);
                    activeTickets.remove(licenseNumber);
                    return;
                }
            }
        }

    }

}
