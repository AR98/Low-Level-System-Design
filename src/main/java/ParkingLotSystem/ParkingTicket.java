package ParkingLotSystem;
import java.util.*;
public class ParkingTicket {
    private final Vehicle vehicle;
    private final double startHour;
    private final PricingStrategy pricingStrategy;
    public ParkingTicket(Vehicle vehicle, PricingStrategy pricingStrategy) {
        this.vehicle = vehicle;
        this.startHour = System.currentTimeMillis() ;
        this.pricingStrategy = pricingStrategy;
    }
    public double calculatePricing() {
        double endTime  = System.currentTimeMillis();
         int hours = (int)Math.max(1, (endTime - startHour)/ (1000*60*60));
         return pricingStrategy.calculatePricing(hours);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
