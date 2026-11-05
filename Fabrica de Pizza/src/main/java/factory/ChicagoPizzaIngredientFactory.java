package factory;

import ingredientes.Cheese;
import ingredientes.Clam;
import ingredientes.Dough;
import ingredientes.Pepperoni;
import ingredientes.Sauce;
import ingredientes.Veggies;
import ingredientesEspecificos.Blackolives;
import ingredientesEspecificos.Eggplant;
import ingredientesEspecificos.FrozenClam;
import ingredientesEspecificos.MozzarellaCheese;
import ingredientesEspecificos.SlicedPepperoni;
import ingredientesEspecificos.Spinach;
import ingredientesEspecificos.ThickCrustDough;
import ingredientesEspecificos.TomatoSauce;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new TomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Blackolives(), new Spinach(), new Eggplant()
		};
		return veggies;
	}
		

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clam createClam() {
		return new FrozenClam();
	}

}
