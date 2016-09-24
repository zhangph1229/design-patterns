package cn.edu.neu.zhangph.test.factory;

public class Test {
	public static void main(String[] args) {
//		Car.getInstance().run();
//		Moveable m = new Plane();
//		m.run();
//		Moveable m1 = Car.getInstance();
//		m1.run();
//		
//		PlaneFactory factory = new PlaneFactory();
//		Moveable m2 = factory.createPlane();
//		m2.run();
		
		VehicleFactory vehicle = new PlaneFactory();
		Moveable m1 = vehicle.create();
		
		VehicleFactory v1 = new CarFactory();
		Moveable m2 = v1.create();
		
		VehicleFactory v2 = new BroomFactory();
		Moveable m3 = v2.create();
		m1.run();
		m2.run();
		m3.run();
	}
}
