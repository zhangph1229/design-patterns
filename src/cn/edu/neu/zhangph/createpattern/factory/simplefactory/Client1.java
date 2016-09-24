package cn.edu.neu.zhangph.createpattern.factory.simplefactory;

import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Audi;
import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Byd;
import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Car;

public class Client1 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		c1.run();
		c2.run();
	}
}
