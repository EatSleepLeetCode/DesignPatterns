package Strategy;

public class MallardDuck extends Duck 
{
	void display()
	{
		System.out.println("I am Mallard duck!");
	}
	
	public MallardDuck()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
