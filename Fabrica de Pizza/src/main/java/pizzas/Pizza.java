package pizzas;

import ingredientes.Cheese;
import ingredientes.Clam;
import ingredientes.Dough;
import ingredientes.Pepperoni;
import ingredientes.Sauce;
import ingredientes.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Assar por 25 minutos a 350°C");
	}
	
	void cut() {
		System.out.println("Cortar a pizza em fatias diagonais");
	}
	void box() {
		System.out.println("Colocar a pizza na caixa oficial da pizzaria");
	}
	public void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	public String toString() {
		return String.format("Pizza feita");
	}
	
}
