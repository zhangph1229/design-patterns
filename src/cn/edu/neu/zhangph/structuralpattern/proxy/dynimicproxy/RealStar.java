package cn.edu.neu.zhangph.structuralpattern.proxy.dynimicproxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-��̸");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-ǩԼ");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-��Ʊ");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-����");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("RealStar-��Ǯ");
	}

}
