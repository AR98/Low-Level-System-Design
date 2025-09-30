package MovieBooking;

import java.util.List;

public class PremiumPriceStrategy implements PriceStrategy {
    public double calculatePrice(List<ShowSeat> showSeats) {
        return showSeats.size() * 200;
    }
}
