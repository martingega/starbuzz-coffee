package org.starbuzzcoffee.concreteDecorators;

import org.starbuzzcoffee.CondimentDecorator;
import org.starbuzzcoffee.abstractComponent.Beverage;

/**
 * Mocha is a decorator so we extend CondimentDecorator.
 * CondimentDecorator extends Beverage.
 */
public class Mocha extends CondimentDecorator {

    /*
     * We're going to instantiate Mocha with a reference to a Beverage.
     * We set this instance variable to the object we are wrapping.
     * Here, we're passing the beverage we're wrapping to the decorator's constructor.
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /*
     * We want our description to include not only the beverage
     * but also each item decorating the beverage.
     */
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /*
     * To compute the cost of our beverage with Mocha, first we delegate
     * the call to the object we're decorating so that it can compute the
     * cost then we add the cost of Mocha to the result.
     */
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
