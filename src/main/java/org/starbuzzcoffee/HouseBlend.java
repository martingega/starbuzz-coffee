package org.starbuzzcoffee;

public class HouseBlend extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public HouseBlend() {
        description = "House blend coffee";
    }

    /*
     * Here we compute the cost of a House blend coffee. We don't have
     * to worry about adding in condiments in this class, we just need
     * to return the price of a House blend coffee.
     */
    @Override
    public double cost() {
        return 0.89;
    }
}
