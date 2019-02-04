package IShowRoom;

import java.util.ArrayList;
import java.util.Date;
import ITesla.ITesla;

public interface IShowRoomDatabaseEntry {
    ITesla getTesla();
    ArrayList<Date> getBookedDates();
    void bookForDate(Date targetDate);
    void removeBookingForDate(Date targetDate);
}
