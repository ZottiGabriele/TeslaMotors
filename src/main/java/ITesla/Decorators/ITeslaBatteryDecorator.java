package ITesla.Decorators;

import ITesla.Enums.BatteryType;
import ITesla.ITesla;

public class ITeslaBatteryDecorator extends ITeslaDecorator{

    BatteryType batteryType;

    public ITeslaBatteryDecorator(ITesla component, BatteryType batteryType) {
        super(component);
        this.batteryType = batteryType;
    }

    @Override
    public BatteryType getBatteryType() {
        return batteryType;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        switch (batteryType) {
            case kwh75:
                break;
            case kwh90:
                out += 2500;
                break;
            case kwh110:
                out += 5000;
                break;
        }
        return out;
    }
}
