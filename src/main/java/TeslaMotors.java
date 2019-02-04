import IShowRoom.IShowRoom;
import ITesla.Enums.*;
import ITesla.ITesla;
import ITesla.ITeslaUsed;
import ITesla.ITeslaBuilder;
import ITesla.DebugPrinter;
import IShowRoom.*;

import java.util.Date;

public class TeslaMotors {

    public static void main(String[] args) {

        ITeslaBuilder teslaBuilder = new ITeslaBuilder();

        IShowRoom milanShowRoom = new SimpleShowRoom();
        Date targetDate = new Date();
        Date secondDate = new Date(1211, 12, 12);

        milanShowRoom.getAllAvailableTeslasForTestDrive(TeslaModel.modelX, targetDate);
        milanShowRoom.bookTestDrive(TeslaModel.modelX, targetDate);
        milanShowRoom.getAllAvailableTeslasForTestDrive(TeslaModel.modelX, targetDate);

        milanShowRoom.getAllAvailableTeslasForTestDrive(TeslaModel.modelX, secondDate);

        ITesla t = milanShowRoom.getAllAvailableTeslas().get(0);
        milanShowRoom.bookPurchase(t);
        milanShowRoom.bookPurchase(t);
        milanShowRoom.bookPurchase(teslaBuilder.getTesla(TeslaModel.model3).build());
        milanShowRoom.getAllAvailableTeslasForTestDrive(TeslaModel.modelX, secondDate);
    }
}
