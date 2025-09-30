package MovieBooking;

import java.util.List;

public interface PriceStrategy {

    double calculatePrice(List<ShowSeat> showSeats);
}
