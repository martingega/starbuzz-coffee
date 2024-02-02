package org.starbuzzcoffee.abstractComponent;

/**
 * Beverage is an abstract class with two methods for description and cost
 * It acts as our abstract component class of the Decorator pattern
 */
public abstract class Beverage {

    public String description = "Unknown beverage"; // the description instance variable is set in each sublass and holds a description of the beverage

    public String getDescription() {
        return description;
    }

    public abstract double cost(); // this method is abstract because sublasses need to define their own implementation

}
