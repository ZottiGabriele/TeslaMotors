package ITesla.Decorators;

import ITesla.ITesla;
import ITesla.ITeslaUsed;

public class ITeslaUsedDecorator extends ITeslaDecorator implements ITeslaUsed {

    float usedPrice;
    float kilometersCount;
    String licenceDate;

    public ITeslaUsedDecorator(ITesla component, float usedPrice, float kilometersCount, String licenceDate) {
        super(component);
        this.usedPrice = usedPrice;
        this.kilometersCount = kilometersCount;
        this.licenceDate = licenceDate;
    }

    @Override
    public float getPrice() {
        return usedPrice;
    }

    public float getKilometersConut() {
        return this.kilometersCount;
    }

    public String getLicenceDate() {
        return this.licenceDate;
    }
}
