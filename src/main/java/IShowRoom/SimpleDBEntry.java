package IShowRoom;

import ITesla.ITesla;

import java.util.ArrayList;
import java.util.Date;

public class SimpleDBEntry implements ITeslaDBEntry {

    ITesla associatedTesla;
    ArrayList<Date> bookedDates = new ArrayList<>();

    public SimpleDBEntry(ITesla associatedTesla) {
        this.associatedTesla = associatedTesla;
    }

    public ITesla getAssociatedTesla() {
        return associatedTesla;
    }

    public ArrayList<Date> getBookedDates() {
        return bookedDates;
    }

    public boolean isAvailableForTheDate(Date targetDate) {
        return bookedDates.stream().noneMatch(d -> d.compareTo(targetDate) == 0);
    }

    public void bookForTheDate(Date targetDate) {
        bookedDates.add(targetDate);
        System.out.println("Booked " + associatedTesla + " for the date " + targetDate);
    }
}
