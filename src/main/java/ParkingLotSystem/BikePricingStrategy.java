package ParkingLotSystem;

public class BikePricingStrategy implements PricingStrategy {
    public double calculatePricing(int hours) {
        return hours * 40.0;
    }
}
