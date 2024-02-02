package org.starbuzzcoffee;

import org.starbuzzcoffee.abstractComponent.Beverage;

/**
 * We need it to be interchangeable with a Beverage so we extend the Beverage class
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage; // the reference to the Beverage that the Decorators will be wrapping

    public abstract String getDescription();

}
