package IShowRoom;

import ITesla.ITesla;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class SimpleShowRoom implements IShowRoom {

    private final String name;
    private final String city;
    SimpleShowRoomDatabase database = new SimpleShowRoomDatabase();

    public SimpleShowRoom(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public ArrayList<ITesla> getAllCars() {
        //TODO
        return null;
    }

    public ArrayList<ITesla> getAvailableCars(Date targetDate) {
        ArrayList<ITesla> out = new ArrayList<ITesla>();

        return out;
    }

    public void addCarToShowroom(ITesla carToAdd) {
        IShowRoomDatabaseEntry entry = new SimpleShowRoomDatabaseEntry(carToAdd);
        database.addEntry(entry);
    }

    public void removeCarFromShowroom(ITesla target) {
        for(IShowRoomDatabaseEntry e : database.getAllEntries()) {
            if(e.getTesla() == target) {
                database.removeEntry(e);
            }
        }
    }

    public void bookCarForDate(ITesla targetTesla, Date targetDate) {
        database.getAllEntries().stream().filter(x -> x.getTesla() == targetTesla).collect(Collectors.toList()).get(0).bookForDate(targetDate);
    }

    public String getShowRoomName() {
        return this.name;
    }

    public String getShowRoomCity() {
        return this.city;
    }


}
