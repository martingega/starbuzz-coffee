package org.starbuzzcoffee;

import org.starbuzzcoffee.abstractComponent.Beverage;
import org.starbuzzcoffee.concreteComponents.DarkRoast;
import org.starbuzzcoffee.concreteComponents.Espresso;
import org.starbuzzcoffee.concreteComponents.HouseBlend;
import org.starbuzzcoffee.concreteDecorators.Mocha;
import org.starbuzzcoffee.concreteDecorators.Soy;
import org.starbuzzcoffee.concreteDecorators.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        // order up an Espresso without any condiments and print it's description and cost
        Beverage beverage1 = new Espresso(); // cost = $1.99
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // make a Dark roast coffee with double mocha and whip
        Beverage beverage2 = new DarkRoast(); // cost = $0.99
        beverage2 = new Mocha(beverage2); // cost = $0.20
        beverage2 = new Mocha(beverage2); // cost = $0.20
        beverage2 = new Whip(beverage2); // cost = $0.10
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // make a House blend coffee with soy, mocha and whip
        Beverage beverage3 = new HouseBlend(); // cost = $0.89
        beverage3 = new Soy(beverage3); // cost = $0.15
        beverage3 = new Mocha(beverage3); // cost = $0.20
        beverage3 = new Whip(beverage3); // cost = $0.10
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
