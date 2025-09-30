package MovieBooking;

import java.util.List;

public class BookingFactory {
    public static Booking createBooking(String type, User user, Show show, List<ShowSeat> seats){
        switch (type) {
            case "REGULAR":
                return new NormalBooking(user, show, seats);
            case "PREMIUM":
                return new PremiumBooking(user, show, seats);
            default:
                throw new IllegalArgumentException("Unknown booking type: " + type);
        }

    }
}
