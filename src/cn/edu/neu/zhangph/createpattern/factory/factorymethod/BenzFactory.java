package cn.edu.neu.zhangph.createpattern.factory.factorymethod;

public class BenzFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
