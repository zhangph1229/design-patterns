package cn.edu.neu.zhangph.createpattern.factory.simplefactory;

public class CarFactory2 {
	public static Car createAudi(){
		return new Audi();
	}
	public static Car createByd(){
		return new Byd();
	}
}
