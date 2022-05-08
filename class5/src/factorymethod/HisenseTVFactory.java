package factorymethod;

public class HisenseTVFactory implements TVFactory{
	public TV produceTV() {
		System.out.println("海信电视机工厂生产海信电视。");
		return new HisenseTV();
		
	}

}
