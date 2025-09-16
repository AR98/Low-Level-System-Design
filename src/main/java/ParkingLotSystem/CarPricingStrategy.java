package ParkingLotSystem;

public class CarPricingStrategy implements PricingStrategy {
    public double calculatePricing(int hours) {
        return hours * 20.0;
    }
}
