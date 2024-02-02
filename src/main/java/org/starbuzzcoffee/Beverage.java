package org.starbuzzcoffee;

public abstract class Beverage {

    public String description; // the description instance variable is set in each sublass and holds a description of the beverage

    public String getDescription() {
        return description;
    }

    public abstract double cost(); // this method is abstract because sublasses need to define their own implementation

}
