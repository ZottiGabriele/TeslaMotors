package IShowRoom;

import IShowRoom.IShowRoom;
import ITesla.ITesla;

import java.util.ArrayList;

public class SimpleShowRoomDatabase {
    private ArrayList<IShowRoomDatabaseEntry> entries = new ArrayList<>();

    public void addEntry(IShowRoomDatabaseEntry entry) {
        if(!entries.contains(entry)) {
            entries.add(entry);
        }
    }

    public void removeEntry(IShowRoomDatabaseEntry entry) {
        if(entries.contains(entry)) {
            entries.remove(entry);
        }
    }

    public ArrayList<IShowRoomDatabaseEntry> getAllEntries() {
        return entries;
    }
}
