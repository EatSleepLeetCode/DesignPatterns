package Strategy;

public class RedHeadDuck extends Duck 
{
	public RedHeadDuck()
	{
		flyBehavior = new FlyWithoutWings();
		quackBehavior = new Squeak();
	}
	
	void display()
	{
		System.out.println("I am Redhead duck!");
	}
}
