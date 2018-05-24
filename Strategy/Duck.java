package Strategy;

public abstract class Duck 
{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	
	void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	void performFly()
	{
		flyBehavior.fly();
	}
	
	void performQuack()
	{
		quackBehavior.quack();
	}
	
	void swim()
	{
		System.out.println("I am swimming!");
	}
	
	abstract void display();
}
