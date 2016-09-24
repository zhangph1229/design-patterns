package cn.edu.neu.zhangph.behavioralpattern.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		Market market = new Market(m);
		Develepment develepment = new Develepment(m);
		Finacial finacial = new Finacial(m);
		
		market.selfAction();
		market.outAction();
	}
}
