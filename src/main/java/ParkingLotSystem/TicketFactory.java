package ParkingLotSystem;

public class TicketFactory {

    public static ParkingTicket createParkingTicket(Vehicle vehicle) {
        PricingStrategy strategy;
        if(vehicle instanceof Bike){
            strategy = new BikePricingStrategy();
        }
        else if(vehicle instanceof Car){
            strategy = new CarPricingStrategy();
        }
        else if(vehicle instanceof Truck){
            strategy = new TruckPricingStrategy();
        }else{
            throw new IllegalArgumentException("something went wrong!");
        }

        return new ParkingTicket(vehicle, strategy);
    }
}
