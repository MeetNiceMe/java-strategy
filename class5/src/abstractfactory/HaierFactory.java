package abstractfactory;

public class HaierFactory implements EFactory{
	public Television produceTelevision() {
		return new HaierTelevision();
		
	}

	@Override
	public AirConditioner produceAirConditioner() {
		// TODO Auto-generated method stub
		return new HaierAirConditioner();
	}

}
