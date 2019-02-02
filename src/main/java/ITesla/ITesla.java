package ITesla;

import ITesla.Enums.*;

public interface ITesla {

    float getPrice();
    TeslaModel getTeslaModel();
    BatteryType getBatteryType();
    ExteriorColor getExteriorColor();
    RoofType getRoofType();
    SeatsModel getSeatsModel();
    SeatsColor getSeatsColor();
}
