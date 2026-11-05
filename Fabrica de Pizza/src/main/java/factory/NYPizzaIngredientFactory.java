package factory;

import ingredientes.Cheese;
import ingredientes.Clam;
import ingredientes.Dough;
import ingredientes.Pepperoni;
import ingredientes.Sauce;
import ingredientesEspecificos.FreshClam;
import ingredientesEspecificos.Garlic;
import ingredientesEspecificos.MarinaraSauce;
import ingredientesEspecificos.Mushroom;
import ingredientesEspecificos.Onion;
import ingredientesEspecificos.RedPepper;
import ingredientesEspecificos.RegiannoCheese;
import ingredientesEspecificos.SlicedPepperoni;
import ingredientesEspecificos.ThinCrustDough;
import ingredientes.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new RegiannoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Garlic(), new Onion(), new Mushroom(), new RedPepper()
		};
		return veggies;
	}
		

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clam createClam() {
		return new FreshClam();
	}

}
