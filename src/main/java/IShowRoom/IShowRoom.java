package IShowRoom;

import ITesla.Enums.TeslaModel;
import ITesla.ITesla;
import ITesla.ITeslaUsed;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

public interface IShowRoom {
    void bookTestDrive(TeslaModel model, Date targetDate);
    ArrayList<ITesla> getAllAvailableTeslasForTestDrive(TeslaModel model, Date targetDate);
    void bookPurchase(ITesla targetTesla);
    void bookPurchase(ITesla targetTesla, float discountPercentage);
    ArrayList<ITeslaUsed> filterUsedTesla(Predicate predicate);
    ArrayList<ITesla> getBookedTeslasWaitingForShipping();
    ArrayList<ITesla> getAllAvailableTeslas();
}
