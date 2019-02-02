package ITesla.Decorators;

import ITesla.ITesla;

public class ITeslaDiscountDecorator extends ITeslaDecorator {

    float discountPercentage;

    public ITeslaDiscountDecorator(ITesla component, float discountPercentage) {
        super(component);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public float getPrice() {
        float out = super.getPrice();
        float discount = (out / 100) * discountPercentage;
        return out - discount;
    }
}
