package org.starbuzzcoffee;

public class Espresso extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public Espresso() {
        description = "Espresso coffee";
    }

    // each subclass implement cost() to return the cost of the beverage
    @Override
    public double cost() {
        return 1.99;
    }
}
