package cn.edu.neu.zhangph.test.factory;

public class CarFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return Car.getInstance();
	}

}
