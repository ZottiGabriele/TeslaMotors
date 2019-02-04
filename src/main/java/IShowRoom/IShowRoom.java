package IShowRoom;

import ITesla.ITesla;

import java.util.ArrayList;
import java.util.Date;

public interface IShowRoom {
    ArrayList<ITesla> getAllCars();
    ArrayList<ITesla> getAvailableCars(Date targetDate);
    void addCarToShowroom(ITesla carToAdd);
    void removeCarFromShowroom(ITesla target);
    void bookCarForDate(ITesla targetTesla, Date targetDate);
    String getShowRoomName();
    String getShowRoomCity();
}
