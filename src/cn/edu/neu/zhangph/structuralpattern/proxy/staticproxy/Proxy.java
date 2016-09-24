package cn.edu.neu.zhangph.structuralpattern.proxy.staticproxy;

public class Proxy implements Star{
	
	RealStar realStar = new RealStar();
	
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("Proxy-面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("Proxy-签约");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("Proxy-买票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		realStar.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("Proxy-收钱");
	}
	
}
