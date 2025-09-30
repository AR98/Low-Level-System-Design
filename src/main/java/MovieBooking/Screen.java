package MovieBooking;

import java.util.List;

public class Screen {
    private final int number;
    private final List<Seat> seats;
    public Screen(int number, List<Seat> seats) {
        this.number = number;
        this.seats = seats;
    }
    public int getNumber() {
        return number;
    }
    public List<Seat> getSeats() {return seats;}

}
