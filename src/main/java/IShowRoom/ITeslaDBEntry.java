package IShowRoom;

import ITesla.ITesla;

import java.util.ArrayList;
import java.util.Date;

public interface ITeslaDBEntry {
    ITesla getAssociatedTesla();
    ArrayList<Date> getBookedDates();
    boolean isAvailableForTheDate(Date targetDate);
    void bookForTheDate(Date targetDate);
}
