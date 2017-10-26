package designPatternsTutorial;

public class Cat extends Animal {
	public Cat(){
		super();
		System.out.println("LOG: Cat - Cat constructor called.");
		setSound("Meow!");
	}
}
