package MovieBooking;

import java.util.List;

public class NormalBooking extends Booking {
    public NormalBooking(User user, Show show, List<ShowSeat> seats) {
        super(user, show, seats);
    }

    public  double calculatePrice() {
        return new RegularPriceStrategy().calculatePrice(getBookedSeats());
    }
}
