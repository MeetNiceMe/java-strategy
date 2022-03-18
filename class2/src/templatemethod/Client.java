package templatemethod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTemplateMethod bank;
		bank=(BankTemplateMethod)XMLUtil.getBean();
		bank.process();
		System.out.println("-------------------");

	}

}
