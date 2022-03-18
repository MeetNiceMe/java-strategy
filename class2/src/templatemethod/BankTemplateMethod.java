package templatemethod;

public abstract class BankTemplateMethod {
	public void takeNumber() {
		System.out.println("取号排队，");
	}
	public abstract void transact();
	public boolean WantsInvest() {
		return true;
	}
	public void evaluate() {
		System.out.println("反馈评分，");
	}
	public void invest() {
		System.out.println("资询理财");
	}
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
		if(WantsInvest()) {
			invest();
		}
	}
}
