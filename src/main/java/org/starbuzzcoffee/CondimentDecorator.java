package org.starbuzzcoffee;

/**
 * We need it to be interchangeable with a Beverage so we extend the Beverage class
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage; // the reference to the Beverage that the Decorators will be wrapping

    public abstract String getDescription();

}
