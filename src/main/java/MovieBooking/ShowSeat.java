package MovieBooking;

public class ShowSeat {
    private final Seat seat;
    private boolean isBooked;

    public ShowSeat(Seat seat) {
        this.seat = seat;
        isBooked = false;
    }
    public Seat getSeat() {return seat;}
    public boolean isBooked() {return isBooked;}
    public void book() {this.isBooked = true;}
}
