package ITesla.Decorators;

import ITesla.Enums.*;
import ITesla.ITesla;

public abstract class ITeslaDecorator implements ITesla {

    private ITesla component;
    ITeslaDecorator(ITesla component) {
        this.component = component;
    }

    //@Override
    public float getPrice() {
        return component.getPrice();
    }

//    @Override
    public TeslaModel getTeslaModel() {
        return component.getTeslaModel();
    }

//    @Override
    public BatteryType getBatteryType() {
        return component.getBatteryType();
    }

//    @Override
    public ExteriorColor getExteriorColor() {
        return component.getExteriorColor();
    }

//    @Override
    public RoofType getRoofType() {
        return component.getRoofType();
    }

//    @Override
    public SeatsModel getSeatsModel() {
        return component.getSeatsModel();
    }

//    @Override
    public SeatsColor getSeatsColor() {
        return component.getSeatsColor();
    }
}
