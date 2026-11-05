package pizzas;

import factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	};

	void prepare() {
		System.out.printf("Preparing %s", name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		}
}
