package MovieBooking;

import java.util.List;

public class RegularPriceStrategy  implements PriceStrategy {

    public double calculatePrice(List<ShowSeat> showSeats) {
        return showSeats.size() * 100.0;
    }
}
