package factory;

import ingredientes.Dough;
import ingredientes.Sauce;
import ingredientes.Cheese;
import ingredientes.Veggies;
import ingredientes.Pepperoni;
import ingredientes.Clam;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
	
	
}
