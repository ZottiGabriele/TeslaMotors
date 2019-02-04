package IShowRoom;

import ITesla.Decorators.ITeslaDiscountDecorator;
import ITesla.Enums.BatteryType;
import ITesla.Enums.TeslaModel;
import ITesla.ITesla;
import ITesla.ITeslaUsed;
import ITesla.ITeslaBuilder;
import ITesla.DebugPrinter;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

public class SimpleShowRoom implements IShowRoom {

    ITeslaDB database;
    ArrayList<ITesla> bookedTeslas = new ArrayList<ITesla>();

    public SimpleShowRoom() {
        database = new SimpleTeslaDB();
        ITeslaBuilder builder = new ITeslaBuilder();

        //TEST CODE-----------------------------------------------------------------------------------------------------
       ITesla test = builder.getTesla(TeslaModel.modelX).build();
        database.addEntry(test);
        database.addEntry(test);
        database.addEntry(builder.getTesla(TeslaModel.modelX)
                .withBattery(BatteryType.kwh110)
                .build());
        database.removeEntry(test);
        database.removeEntry(test);
        database.addEntry(test);
        database.addEntry(builder.getTesla(TeslaModel.modelS)
                .buildUsed(10, 141412, new Date(1212, 12, 12)));
        //--------------------------------------------------------------------------------------------------------------
    }

    public ArrayList<ITesla> getAllAvailableTeslasForTestDrive(TeslaModel model, Date targetDate) {
        ArrayList<ITesla> availableModels = database.getAllTeslasMatching(entry ->
                entry.getAssociatedTesla().getTeslaModel() == model
                && entry.isAvailableForTheDate(targetDate));

        System.out.println("Found matching model: " + model + ", available for the date " + targetDate + " -------------------------");
        for (ITesla t : availableModels) {
            System.out.println(DebugPrinter.prettyPrint(t));
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        return availableModels;
    }

    public void bookTestDrive(TeslaModel model, Date targetDate) {
        ArrayList<ITeslaDBEntry> possibleEntries = database.getAllEntriesMatching(entry ->
                entry.getAssociatedTesla().getTeslaModel() == model
                && entry.isAvailableForTheDate(targetDate));
        if(!possibleEntries.isEmpty()) {
            possibleEntries.get(0).bookForTheDate(targetDate);
        }
    }

    public void bookPurchase(ITesla targetTesla) {
        if(database.getFirstTeslaMatching(entry -> entry.getAssociatedTesla() == targetTesla) != null) {
            System.out.println("BOOKED");
            bookedTeslas.add(targetTesla);
            database.removeEntry(targetTesla);
        } else {
            System.err.println("TRYED TO BOOK TESLA NOT AVAILABLE DUH");
        }
    }

    public void bookPurchase(ITesla targetTesla, float discountPercentage) {
        if(database.getFirstTeslaMatching(entry -> entry.getAssociatedTesla() == targetTesla) != null) {
            System.out.println("BOOKED");
            ITesla discountedTesla = new ITeslaDiscountDecorator(targetTesla, discountPercentage);
            bookedTeslas.add(discountedTesla);
            database.removeEntry(targetTesla);
        } else {
            System.err.println("TRYED TO BOOK TESLA NOT AVAILABLE DUH");
        }
    }

    public ArrayList<ITeslaUsed> filterUsedTesla(Predicate predicate) {
        //TODO
        return null;
    }

    public ArrayList<ITesla> getBookedTeslasWaitingForShipping() {
        return bookedTeslas;
    }

    public ArrayList<ITesla> getAllAvailableTeslas() {
        return database.getAllTeslasMatching(x -> true);
    }
}
