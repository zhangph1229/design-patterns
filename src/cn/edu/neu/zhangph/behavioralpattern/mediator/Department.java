package cn.edu.neu.zhangph.behavioralpattern.mediator;

public interface Department {
	void selfAction();
	void outAction();
}

class Develepment implements Department{
	private Mediator mediator; //持有中介者
	
	public Develepment(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("develepment", this);
	}

	@Override
	public void selfAction() {
		System.out.println("开发项目。。。");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作。。。");
	}
	
}

class Finacial implements Department{
	private Mediator mediator; //持有中介者
	
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("管理财务。。。");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，钱太多了，就是不让花。。。");
	}
	
}
class Market implements Department{
	private Mediator mediator; //持有中介者
	
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("跑市场去了。。。");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，市场部需要钱了。。。");
		mediator.command("finacial");
	}
	
}