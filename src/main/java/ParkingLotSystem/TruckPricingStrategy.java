package ParkingLotSystem;

public class TruckPricingStrategy implements PricingStrategy {
    public double calculatePricing(int hours) {
        return hours * 60.0;
    }
}
