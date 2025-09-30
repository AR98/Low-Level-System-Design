package MovieBooking;

import java.util.List;

abstract class Booking {
    private final User user;
    private final Show show;
    private final List<ShowSeat> bookedSeats;
    private BookingStatus status;

    public Booking(User user, Show show, List<ShowSeat> bookedSeats) {
        this.user = user;
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.status = BookingStatus.CONFIRMED;
    }

    public User getUser() {
        return user;
    }
    public Show getShow() {
        return show;
    }
    public List<ShowSeat> getBookedSeats() {
        return bookedSeats;
    }
    public BookingStatus getStatus() {
        return status;
    }
    public abstract double calculatePrice();
}
