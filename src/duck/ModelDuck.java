package duck;

import duck.fly.FlyNoWay;
import duck.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();	//开始模型鸭是不会飞的
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck!");
	}

}
