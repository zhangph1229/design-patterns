package cn.edu.neu.zhangph.test.factory;

public class PlaneFactory extends VehicleFactory{
	public Moveable create(){
		return new Plane();
	}
}
