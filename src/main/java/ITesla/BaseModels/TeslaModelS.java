package ITesla.BaseModels;

import ITesla.Enums.*;
import ITesla.ITesla;

public class TeslaModelS implements ITesla {

    float startingPrice;

    public TeslaModelS(float startingPrice) {
        this.startingPrice = startingPrice;
    }

    public float getPrice() {
        return this.startingPrice;
    }

    public TeslaModel getTeslaModel() {
        return TeslaModel.modelS;
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
