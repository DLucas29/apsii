package pizzas;

import factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	};

	void prepare() {
		System.out.printf("Preparing %s", name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		}
}
