package ITesla.Decorators;

import ITesla.Enums.SeatsColor;
import ITesla.ITesla;

public class ITeslaSeatsColorDecorator extends ITeslaDecorator {

    SeatsColor seatsColor;

    public ITeslaSeatsColorDecorator(ITesla component, SeatsColor seatsColor) {
        super(component);
        this.seatsColor = seatsColor;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        switch (seatsColor) {
            case black:
                break;
            case blue:
                out += 250;
                break;
        }
        return out;
    }

    @Override
    public SeatsColor getSeatsColor() {
        return seatsColor;
    }
}
