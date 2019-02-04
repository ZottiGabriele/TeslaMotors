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
        DebugPrinter debugPrinter = new DebugPrinter();
        ITesla myNewModelS = teslaBuilder.getTesla(TeslaModel.modelS)
                .withBattery(BatteryType.kwh90)
                .withExteriorColor(ExteriorColor.red)
                .withRoofType(RoofType.cabrio)
                .withSeatsModel(SeatsModel.sport)
                .withSeatsColor(SeatsColor.blue)
                .build();

        ITeslaUsed myUsedModelX = teslaBuilder.getTesla(TeslaModel.modelX)
                .withBattery(BatteryType.kwh110)
                .withExteriorColor(ExteriorColor.blue)
                .buildUsed(12345, 4321, new Date(2011, 11, 12));

        IShowRoomFactory showRoomFactory = new SimpleShowRoomFactory();
        IShowRoom milanShowRoom = showRoomFactory.getShowRoom("Milan-Teslas", "Milan");
        milanShowRoom.addCarToShowroom(myNewModelS);
        milanShowRoom.addCarToShowroom(myUsedModelX);

        for(ITesla t :milanShowRoom.getAvailableCars(new Date())) {
            System.out.println(debugPrinter.prettyPrint(t));
        }
    }
}
