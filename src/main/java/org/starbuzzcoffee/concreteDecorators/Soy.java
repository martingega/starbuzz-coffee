package org.starbuzzcoffee.concreteDecorators;

import org.starbuzzcoffee.CondimentDecorator;
import org.starbuzzcoffee.abstractComponent.Beverage;

/**
 * Soy is a decorator so we extend CondimentDecorator.
 * CondimentDecorator extends Beverage.
 */
public class Soy extends CondimentDecorator {

    /*
     * We're going to instantiate Soy with a reference to a Beverage.
     * We set this instance variable to the object we are wrapping.
     * Here, we're passing the beverage we're wrapping to the decorator's constructor.
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /*
     * We want our description to include not only the beverage
     * but also each item decorating the beverage.
     */
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /*
     * To compute the cost of our beverage with Soy, first we delegate
     * the call to the object we're decorating so that it can compute the
     * cost then we add the cost of Soy to the result.
     */
    public double cost() {
        double cost = beverage.cost();
        // the size propagates all the way to the concrete beverage
        // soy costs 20, 15 and 10 respectively for large, medium and small coffees
        if (beverage.getSize() == Size.LARGE) {
            cost += 0.20;
        } else if (beverage.getSize() == Size.MEDIUM) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.SMALL) {
            cost += 0.10;
        }
        return cost;
    }
}
