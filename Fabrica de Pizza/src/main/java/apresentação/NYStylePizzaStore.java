package apresentação;

import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.VeggiePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;

public class NYStylePizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo de Nova York");
        } else if (item.equals("veggies")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza Vegetariana no Estilo de Nova York");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo de Nova York");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de Calabresa no Estilo de Nova York");
        }

        return pizza;
    }
}