package IShowRoom;

import java.util.ArrayList;

public interface IShowRoomDatabase {
    void addEntry(IShowRoomDatabaseEntry entry);
    void removeEntry(IShowRoomDatabaseEntry entry);
    ArrayList<IShowRoomDatabaseEntry> getAllEntries();
}
