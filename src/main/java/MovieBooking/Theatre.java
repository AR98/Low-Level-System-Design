package MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String name;
    private final City city;
    private final List<Screen> screens;

    public Theatre(String name, City city){
        this.name = name;
        this.city = city;
        this.screens = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public  City getCityName() {
        return city;
    }
    public List<Screen> getScreens() {
        return screens;
    }
    public void addScreen(Screen screen){
        this.screens.add(screen);
    }


}
