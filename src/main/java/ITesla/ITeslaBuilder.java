package ITesla;

import ITesla.Decorators.*;
import ITesla.Enums.*;
import ITesla.BaseModels.*;

import java.util.Date;

public class ITeslaBuilder {

    private ITesla component;

    public ITeslaBuilder getTesla(TeslaModel model) {
        switch (model) {
            case modelX:
                component = new TeslaModelX(25000);
                break;
            case modelS:
                component = new TeslaModelS(50000);
                break;
            case model3:
                component = new TeslaModel3(15000);
                break;
        }
        return this;
    }

    public ITeslaBuilder withBattery(BatteryType batteryType) {
        component = new ITeslaBatteryDecorator(component, batteryType);
        return this;
    }

    public ITeslaBuilder withExteriorColor(ExteriorColor exteriorColor) {
        component = new ITeslaExteriorColorDecorator(component, exteriorColor);
        return this;
    }

    public ITeslaBuilder withRoofType(RoofType roofType) {
        component = new ITeslaRoofDecorator(component, roofType);
        return this;
    }

    public ITeslaBuilder withSeatsModel(SeatsModel seatsModel) {
        component = new ITeslaSeatsModelDecorator(component, seatsModel);
        return this;
    }

    public ITeslaBuilder withSeatsColor(SeatsColor seatsColor) {
        component = new ITeslaSeatsColorDecorator(component, seatsColor);
        return this;
    }

    public ITesla applyDiscount(ITesla target, float discountPercentage) {
        component = new ITeslaDiscountDecorator(target, discountPercentage);
        return build();
    }

    public ITeslaUsed applyDiscount(ITeslaUsed target, float discountPercentage) {
        component = new ITeslaDiscountDecorator(target, discountPercentage);
        return buildUsed(component.getPrice(), target.getKilometersCount(), target.getLicenceDate());
    }


    public ITesla build() {
        ITesla tmp = component;
        component = null;
        return tmp;
    }

    public ITeslaUsed buildUsed(float usedPrice, float kilometersCount, Date licenceDate) {
        ITeslaUsed out = new ITeslaUsedDecorator(component, usedPrice, kilometersCount, licenceDate);
        component = null;
        return out;
    }
}
