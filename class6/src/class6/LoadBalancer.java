package class6;

import java.util.*;
//负载均衡器类，充当单例角色
public class LoadBalancer {
	/*私有静态成员变量，存在唯一实例,volatile禁止指令重新排序
	 * 保证所有线程看到这个变量是一致的
	 */
	private volatile static LoadBalancer instance=null;
	//服务器集合
	private List serverList=null;
	//私有构造函数
	private LoadBalancer() {
		serverList = new ArrayList();
	}
	//共有静态成员方法，返回唯一实例
	public static LoadBalancer getLoadBalancer() {
		/*为什么在进入同步代码块时需要进行进行判空，假如有线程A和线程B，
		 * 这时线程A先判断instance为null，所以它进入了同步代码块，
		 * 创建了对象，然后线程B再进来时，它就不必再进入同步代码快了，
		 * 可以直接返回，也其实也就是懒加载，可以加快执行速度。*/
		if(instance ==null) {
			synchronized(LoadBalancer.class) {
				/*
				 * 为什么在同步代码块中还要再进行一次判断呢，假如有线程A和线程B，
				 * 它俩A先调用方法，B紧接着调用，这时A、B在分析2出的判空都是空，所以A进入同步代码块，
				 * B进行等待，当A进入同步代码块中创建了对象后，A线程释放了锁，这时B再进入，
				 * 如果这时不加分析3的判空，B又会创建一个实例，这明显不符合规矩。
				 */
				if(instance ==null) {
					instance =new LoadBalancer();
				}
			}
		}
		return instance;
	}
	//增加服务器
	public void addServer(String server) {
		serverList.add(server);
	}
	//删除服务器
	public void removeServer(String server) {
		serverList.remove(server);
	}
	//使用Random类随机获取服务器
	public String getServer() {
		Random random =new Random();
		int i =random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
}
