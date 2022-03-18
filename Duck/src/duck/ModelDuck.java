package duck;

public class ModelDuck extends Duck{
public ModelDuck(){
flyBehavior = new FlyNoWay();
quackBehavior = new Quack();
}
public void display(){
	System.out.println("i`m a model duck");
} 
}
