package cn.edu.neu.zhangph.structuralpattern.proxy.dynimicproxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-签约");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-订票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-唱歌");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-收钱");
	}

}
