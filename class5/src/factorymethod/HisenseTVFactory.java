package factorymethod;

public class HisenseTVFactory implements TVFactory{
	public TV produceTV() {
		System.out.println("���ŵ��ӻ������������ŵ��ӡ�");
		return new HisenseTV();
		
	}

}