package IShowRoom;

import ITesla.ITesla;

import java.util.ArrayList;
import java.util.function.Predicate;

public interface ITeslaDB {
    ArrayList<ITeslaDBEntry> getAllEntries();
    ArrayList<ITeslaDBEntry> getAllEntriesMatching(Predicate<ITeslaDBEntry> predicate);
    ArrayList<ITesla> getAllTeslasMatching(Predicate<ITeslaDBEntry> predicate);
    ITesla getFirstTeslaMatching(Predicate<ITeslaDBEntry> predicate);
    void addEntry(ITesla entryTesla);
    void removeEntry(ITesla targetTesla);
}
