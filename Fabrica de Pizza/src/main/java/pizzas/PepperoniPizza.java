package pizzas;

import factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	};

	void prepare() {
		System.out.printf("Preparing %s", name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPepperoni();
		}
}
