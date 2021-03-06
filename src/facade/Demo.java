package facade;

import decorator.Coffee;

/**
 * Demonstrates facade pattern. In one system. usually one facade object is required. Thus Facade objects are often
 * Singletons.
 */
public class Demo {
    public static void main(String[] args) {
        CoffeeFacade coffeeFacade = new CoffeeFacade();
        Coffee blackCoffee = coffeeFacade.makeBlackCoffee();
        System.out.println("Ingredients: " + blackCoffee.getIngredients() + "; Price: " + blackCoffee.getCost());

        Coffee latte = coffeeFacade.makeLatte();
        System.out.println("Ingredients: " + latte.getIngredients() + "; Price: " + latte.getCost());

        Coffee latteWithWhip = coffeeFacade.makeLatteWithWhip();
        System.out.println("Ingredients: " + latteWithWhip.getIngredients() + "; Price: " + latteWithWhip.getCost());
    }
}
