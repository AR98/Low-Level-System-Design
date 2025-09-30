package MovieBooking;

import LibraryManagementSystem.Book;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City city  = new City("Delhi");
        Theatre theatre = new Theatre("imax", city);
        city.addTheatre(theatre);

        List<Seat> seats = Arrays.asList(
                new Seat(1, SeatType.REGULAR),
                new Seat(2, SeatType.PREMIUM),
                new Seat(3, SeatType.REGULAR)
        );

        Screen screen = new Screen(1, seats);
        theatre.addScreen(screen);

        Movie movie = new Movie("ABC", 120);
        Show show =  new Show(movie, new Date(), screen);

        User user = new User("Jack");
        BookingService bookingService = BookingService.getInstance();
        Booking booking = bookingService.bookSeats("REGULAR", user, show, Arrays.asList(1, 3));

        System.out.println("Booking confirmed for " + booking.getUser().getName() +
                " | Movie: " + booking.getShow().getMovie().getName() +
                " | Price: " + booking.calculatePrice());



    }
}
