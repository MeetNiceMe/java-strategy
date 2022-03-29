package command;

public class TVChangeCommand implements AbstractCommand{
	private Television tv;
	public TVChangeCommand() {
		tv=new Television();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.changeChannel();
	}

}
