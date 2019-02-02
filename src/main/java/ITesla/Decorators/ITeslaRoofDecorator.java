package ITesla.Decorators;

import ITesla.Enums.RoofType;
import ITesla.ITesla;

public class ITeslaRoofDecorator extends ITeslaDecorator {

    RoofType roofType;

    public ITeslaRoofDecorator(ITesla component, RoofType roofType) {
        super(component);
        this.roofType = roofType;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        switch (roofType) {
            case normal:
                break;
            case glass:
                out += 3000;
                break;
            case cabrio:
                out += 10000;
                break;
        }
        return out;
    }

    @Override
    public RoofType getRoofType() {
        return roofType;
    }
}
