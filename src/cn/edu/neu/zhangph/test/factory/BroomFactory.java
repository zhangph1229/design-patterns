package cn.edu.neu.zhangph.test.factory;

public class BroomFactory extends VehicleFactory{

	@Override
	Moveable create() {
		// TODO Auto-generated method stub
		return new Broom();
	}

}
