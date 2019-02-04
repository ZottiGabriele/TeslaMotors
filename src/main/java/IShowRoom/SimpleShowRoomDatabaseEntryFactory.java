package IShowRoom;

import ITesla.ITesla;

public class SimpleShowRoomDatabaseEntryFactory implements IShowRoomDatabaseEntryFactory {

    public IShowRoomDatabaseEntry createEntry(ITesla entry) {
        return new SimpleShowRoomDatabaseEntry(entry);
    }
}
