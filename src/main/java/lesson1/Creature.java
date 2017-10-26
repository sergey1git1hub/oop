package lesson1;

abstract public class Creature {
	public abstract String getName();
	public abstract void setName(String name);
	public abstract double getWeight();
	public abstract void setWeight(double weight);
	public abstract String getSound();
	public abstract void setSound(String sound);
	protected String name;
	protected double weight;
	protected String sound;
}
