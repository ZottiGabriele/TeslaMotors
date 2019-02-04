package IShowRoom;

import ITesla.ITesla;
import IShowRoom.ITeslaDBEntry;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleTeslaDB implements ITeslaDB {

    private ArrayList<ITeslaDBEntry> entries = new ArrayList<ITeslaDBEntry>();

    public ArrayList<ITeslaDBEntry> getAllEntries() {
        return entries;
    }

    public ArrayList<ITeslaDBEntry> getAllEntriesMatching(Predicate<ITeslaDBEntry> predicate) {
        ArrayList<ITeslaDBEntry> out = entries.stream().filter(predicate).collect(Collectors.toCollection(ArrayList::new));
        return out;
    }

    public void removeEntry(ITesla targetTesla) {
        Optional target = entries.stream().filter(entry -> entry.getAssociatedTesla() == targetTesla).findFirst();
        if(target.isPresent()) {
            entries.remove(target.get());
        } else {
            System.err.println("TRYING TO REMOVE ENTRY NOT PRESENT");
        }
    }

    public void addEntry(ITesla entryTesla) {
        Optional target = entries.stream().filter(entry -> entry.getAssociatedTesla() == entryTesla).findAny();
        if(!target.isPresent()) {
            entries.add(new SimpleDBEntry(entryTesla));
        } else {
            System.err.println("ENTRY ALREADY PRESENT");
        }
    }

    public ArrayList<ITesla> getAllTeslasMatching(Predicate<ITeslaDBEntry> predicate) {
        ArrayList<ITeslaDBEntry> possibleEntries = entries.stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<ITesla> out = new ArrayList<ITesla>();
        for(ITeslaDBEntry e : possibleEntries) {
            out.add(e.getAssociatedTesla());
        }
        return out;
    }

    public ITesla getFirstTeslaMatching(Predicate<ITeslaDBEntry> predicate) {
        ITesla out = null;
        ArrayList<ITeslaDBEntry> possibleEntries = entries.stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ArrayList::new));
        if(!possibleEntries.isEmpty()) {
            out = possibleEntries.get(0).getAssociatedTesla();
        }

        return out;
    }
}
