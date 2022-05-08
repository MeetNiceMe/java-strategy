package factorymethod;

import simplefactory.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TV tv;	//新建一个抽象产品
			TVFactory factory;   //新建一个抽象工厂
			factory=(TVFactory)factorymethod.XMLUtil.getBean();	//获取具体工厂
			tv=factory.produceTV();//获取具体产品
			tv.play();//调用产品内函数
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
