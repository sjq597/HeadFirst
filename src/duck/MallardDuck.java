package duck;

import duck.fly.FlyWithWings;
import duck.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}

}
