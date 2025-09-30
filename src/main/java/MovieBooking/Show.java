package MovieBooking;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Show {
    private final Movie movie;
    private final Date time;
    private final List<ShowSeat> seats;
    private final Screen screen;
    public Show(Movie movie, Date time, Screen screen) {
        this.movie = movie;
        this.time = time;
        this.screen = screen;
        this.seats = new ArrayList<>();

        for(Seat s: screen.getSeats()) {
            seats.add(new ShowSeat( s));
        }
    }

    public Movie getMovie() {return movie;}
    public Date getTime() {return time;}
    public List<ShowSeat> getSeats() {return seats;}
    public Screen getScreen() {return screen;}

}
