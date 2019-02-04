package IShowRoom;

import IShowRoom.IShowRoomDatabaseEntry;
import ITesla.ITesla;

import java.util.ArrayList;
import java.util.Date;

public class SimpleShowRoomDatabaseEntry implements IShowRoomDatabaseEntry {

    ITesla entry;
    ArrayList<Date> bookedDates = new ArrayList<>();

    public SimpleShowRoomDatabaseEntry(ITesla entry) {
        this.entry = entry;
    }

    public ITesla getTesla() {
        return entry;
    }

    public ArrayList<Date> getBookedDates() {
        return bookedDates;
    }

    public void bookForDate(Date targetDate) {
        bookedDates.add(targetDate);
    }

    public void removeBookingForDate(Date targetDate) {
        if(bookedDates.contains(targetDate)) {
            bookedDates.remove(targetDate);
        }
    }
}
