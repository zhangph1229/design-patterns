package cn.edu.neu.zhangph.behavioralpattern.mediator;

public interface Department {
	void selfAction();
	void outAction();
}

class Develepment implements Department{
	private Mediator mediator; //�����н���
	
	public Develepment(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("develepment", this);
	}

	@Override
	public void selfAction() {
		System.out.println("������Ŀ������");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨����������");
	}
	
}

class Finacial implements Department{
	private Mediator mediator; //�����н���
	
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("������񡣡���");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨������Ǯ̫���ˣ����ǲ��û�������");
	}
	
}
class Market implements Department{
	private Mediator mediator; //�����н���
	
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("���г�ȥ�ˡ�����");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨�������г�����ҪǮ�ˡ�����");
		mediator.command("finacial");
	}
	
}