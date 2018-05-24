package Strategy;

public class DuckSimulator 
{
	public static void main(String[] args) 
	{
		Duck duck = new MallardDuck();
		duck.swim();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehavior(new FlyWithoutWings());
		duck.setQuackBehavior(new Quack());
		
		duck.swim();
		duck.display();
		duck.performFly();
		duck.performQuack();
	}
}