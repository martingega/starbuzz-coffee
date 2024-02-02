package org.starbuzzcoffee;

public class Decaf extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public Decaf() {
        description = "Decaf coffee";
    }

    // each subclass implement cost() to return the cost of the beverage
    @Override
    public double cost() {
        return 1.05;
    }
}
