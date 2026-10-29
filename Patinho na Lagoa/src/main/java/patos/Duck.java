package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All Ducks float, even decoys!");
	}
}
