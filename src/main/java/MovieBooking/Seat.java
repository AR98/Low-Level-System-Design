package MovieBooking;

public class Seat {
    private int number;
    private SeatType seatType;
    public Seat(int number, SeatType seatType) {
        this.number = number;
        this.seatType = seatType;
    }

    public int getNumber() {return number;}
    public SeatType getSeatType() {return seatType;}

}
