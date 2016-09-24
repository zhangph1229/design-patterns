package cn.edu.neu.zhangph.createpattern.factory.simplefactory;

import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Car;

public class Client2 {
	public static void main(String[] args) {
		Car c1 = CarFactory.createFactory("Audi");
		
		Car c2 = CarFactory.createFactory("Byd");
		
		c1.run();
		c2.run();
	}
}
