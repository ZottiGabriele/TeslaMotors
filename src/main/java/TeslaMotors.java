import ITesla.Enums.*;
import ITesla.ITesla;
import ITesla.ITeslaUsed;
import ITesla.ITeslaBuilder;
import ITesla.DebugPrinter;

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
                .buildUsed(12345, 4321, "15/12/2011");

        System.out.println(debugPrinter.prettyPrint(myNewModelS)+ "\n");
        System.out.println(debugPrinter.prettyPrint(myUsedModelX));
        System.out.println("\tWith " + myUsedModelX.getKilometersCount() + " km since " + myUsedModelX.getLicenceDate());
    }
}
