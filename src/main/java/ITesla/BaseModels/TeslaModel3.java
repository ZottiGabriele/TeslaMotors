package ITesla.BaseModels;

import ITesla.Enums.*;
import ITesla.ITesla;

public class TeslaModel3 implements ITesla {

    float startingPrice;

    public TeslaModel3(float startingPrice) {
        this.startingPrice = startingPrice;
    }

    public float getPrice() {
        return this.startingPrice;
    }

    public TeslaModel getTeslaModel() {
        return TeslaModel.model3;
    }

    public BatteryType getBatteryType() {
        return BatteryType.kwh75;
    }

    public ExteriorColor getExteriorColor() {
        return ExteriorColor.white;
    }

    public RoofType getRoofType() {
        return RoofType.normal;
    }

    public SeatsModel getSeatsModel() {
        return SeatsModel.normal;
    }

    public SeatsColor getSeatsColor() {
        return SeatsColor.black;
    }

}
