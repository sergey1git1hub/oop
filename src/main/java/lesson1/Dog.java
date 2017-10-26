package lesson1;

public class Dog extends Animal {
	public void digHole(){
		System.out.println("Dug a hole.");
	}
	
	public void fly(){
		System.out.println("I am not flying.");
	}
	
	public void changeVar(int randNum){
		randNum = 12;
		System.out.println("randNum in method: " + randNum);
	}
	
	public Dog(){
		super();
		System.out.println("LOG: Dog - Dog constructor called.");
		//System.out.println("LOG: " + this.toString());
		setSound("Bark!");
		flyingType = new CantFly();
	}

}
