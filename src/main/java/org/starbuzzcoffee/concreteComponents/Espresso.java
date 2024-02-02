package org.starbuzzcoffee.concreteComponents;

import org.starbuzzcoffee.abstractComponent.Beverage;

public class Espresso extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public Espresso() {
        description = "Espresso coffee";
    }

    /*
     * Here we compute the cost of an Espresso. We don't have to worry
     * about adding in condiments in this class, we just need to return
     * the price of an Espresso.
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
