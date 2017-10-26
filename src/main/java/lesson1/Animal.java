package lesson1;
import org.apache.logging.log4j.LogManager;

public class Animal {
	

	public Animal(){
		System.out.println("LOG: Animal - Parent class constructor called.");
		//System.out.println("LOG " + this.toString());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight>0){
		this.weight = weight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void fly(){
		System.out.println("I am flying!");
	}
	private String name;
	private int weight;
	private String sound;
	public Flys flyingType;
	
	public String tryToFly(){
	return 
			flyingType.fly();
	}
	
	public void setFlyingAbilbity(Flys newFlyType){
		flyingType = newFlyType;
	}

}
