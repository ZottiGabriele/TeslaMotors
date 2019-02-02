package ITesla.Decorators;

import ITesla.Enums.ExteriorColor;
import ITesla.ITesla;

public class ITeslaExteriorColorDecorator extends ITeslaDecorator {

    ExteriorColor exteriorColor;

    public ITeslaExteriorColorDecorator(ITesla component, ExteriorColor exteriorColor) {
        super(component);
        this.exteriorColor = exteriorColor;
    }

    @Override
    public ExteriorColor getExteriorColor() {
        return this.exteriorColor;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        switch (exteriorColor) {
            case black:
                out += 1000;
                break;
            case blue:
                out += 2000;
                break;
            case red:
                out += 2000;
                break;
            case white:
                break;
        }
        return out;
    }
}
