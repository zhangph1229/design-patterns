package cn.edu.neu.zhangph.createpattern.factory.simplefactory;

import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Audi;
import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Byd;
import cn.edu.neu.zhangph.createpattern.factory.factorymethod.Car;

public class CarFactory {
	public static Car createFactory(String type){
		if("Audi".equals(type)){
			return new Audi();
		}else if("Byd".equals(type)){
			return new Byd();
		}else return null;
	}
}
