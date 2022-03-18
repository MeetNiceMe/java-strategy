package observer;

public class Cat extends MySubject{
	public void cry() {
		System.out.println("猫叫");
		System.out.println("-------------------------");
		//箱所有观察者发出通知
		for(Object obs:observers) {
			((MyObserver)obs).response();
		}
	}
}
