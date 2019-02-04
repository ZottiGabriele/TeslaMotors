package ITesla.Decorators;

import ITesla.ITesla;
import ITesla.ITeslaUsed;

import java.util.Date;

public class ITeslaUsedDecorator extends ITeslaDecorator implements ITeslaUsed {

    float usedPrice;
    float kilometersCount;
    Date licenceDate;

    public ITeslaUsedDecorator(ITesla component, float usedPrice, float kilometersCount, Date licenceDate) {
        super(component);
        this.usedPrice = usedPrice;
        this.kilometersCount = kilometersCount;
        this.licenceDate = licenceDate;
    }

    @Override
    public float getPrice() {
        return usedPrice;
    }

    public float getKilometersCount() {
        return this.kilometersCount;
    }

    public Date getLicenceDate() {
        return this.licenceDate;
    }
}
