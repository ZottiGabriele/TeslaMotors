package ITesla.Decorators;

import ITesla.Enums.SeatsModel;
import ITesla.ITesla;

public class ITeslaSeatsModelDecorator extends ITeslaDecorator {

    private SeatsModel seatsModel;

    public ITeslaSeatsModelDecorator(ITesla component, SeatsModel seatsModel) {
        super(component);
        this.seatsModel = seatsModel;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        switch (seatsModel) {
            case normal:
                break;
            case sport:
                out += 15000;
                break;
        }
        return out;
    }

    @Override
    public SeatsModel getSeatsModel() {
        return seatsModel;
    }
}
