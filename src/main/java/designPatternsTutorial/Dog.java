package designPatternsTutorial;

public class Dog extends Animal {
	public void digHole(){
		System.out.println("Dug a hole.");
	
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
	}

}
