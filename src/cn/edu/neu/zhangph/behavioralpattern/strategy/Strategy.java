package cn.edu.neu.zhangph.behavioralpattern.strategy;

public interface Strategy {
	public double getPrice(double price);
}

class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�¿ͻ���������");
		return price;
	}
	
}

class NewCustomerMaxStrategy implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�����");
		return price*0.9;
	}
	
}

class OldCustomerMaxStrategy implements Strategy {

	@Override
	public double getPrice(double price) {
		System.out.println("�����");
		return price*0.8;
	}
	
}