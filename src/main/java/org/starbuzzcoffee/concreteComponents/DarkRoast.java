package org.starbuzzcoffee.concreteComponents;

import org.starbuzzcoffee.abstractComponent.Beverage;

public class DarkRoast extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public DarkRoast() {
        description = "Dark roast coffee";
    }

    /*
     * Here we compute the cost of a Dark roast coffee. We don't have
     * to worry about adding in condiments in this class, we just need
     * to return the price of a Dark roast coffee.
     */
    @Override
    public double cost() {
        return 0.99;
    }
}
