package simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			TV tv;
			String brandName=XMLUtil.getBean();
			tv=TVFactory.produceTV(brandName);
			tv.play();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
