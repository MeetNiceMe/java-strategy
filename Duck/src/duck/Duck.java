package duck;

public class Duck{
	QuackBehavior quackBehavior;//每只鸭子都会引用实现QuackBehavior接口的对象。
	FlyBehavior flyBehavior;
	public void performQuack(){
		quackBehavior.quack();//鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象。
	}
	public void performFly(){
		flyBehavior.fly();//鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象。
	}
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
		} 
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
		} 

}
