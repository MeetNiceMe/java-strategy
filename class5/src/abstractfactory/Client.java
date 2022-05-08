package abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EFactory factory;	//新建抽象工厂
			Television tv;	//新建抽象产品电视
			AirConditioner ac;	//新建抽象产品空调
			factory=(EFactory)XMLUtil.getBean(); //确定具体工厂
			tv=factory.produceTelevision(); //新建电视
			tv.play();	//播放电视
			ac=factory.produceAirConditioner();//新建空调
			ac.changeTemperature();//调用空调内函数
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
