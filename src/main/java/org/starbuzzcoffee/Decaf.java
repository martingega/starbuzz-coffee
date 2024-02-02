package org.starbuzzcoffee;

public class Decaf extends Beverage {

    /*
     * To take care of the description, we set this in the constructor for
     * the class. The description instance variable is inherited from Beverage.
     */
    public Decaf() {
        description = "Decaf coffee";
    }

    /*
     * Here we compute the cost of a Decaf coffee. We don't have to worry
     * about adding in condiments in this class, we just need to return
     * the price of a Decaf coffee.
     */
    @Override
    public double cost() {
        return 1.05;
    }
}
