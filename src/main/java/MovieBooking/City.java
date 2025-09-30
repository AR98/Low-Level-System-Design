package MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class City {
    private final String name;
    private final List<Theatre> theatre;
    public City(String name)
    {
        this.name = name;
        this.theatre = new ArrayList<>();;
    }
    public String getName() {return name;}
    public List<Theatre> getTheatre() {return theatre;}
    public  void addTheatre(Theatre theatre)
    {
        this.theatre.add(theatre);
    }
}
