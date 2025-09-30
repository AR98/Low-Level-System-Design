package MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private static BookingService instance;
    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public Booking bookSeats(String type, User user, Show show, List<Integer> seats){
        List<ShowSeat> selectedSeats = new ArrayList<>();

        for(ShowSeat s: show.getSeats()){
            if(seats.contains(s.getSeat().getNumber()) && !s.isBooked()){
                s.book();
                selectedSeats.add(s);
            }
        }

        return BookingFactory.createBooking(type, user, show, selectedSeats);

    }
}
