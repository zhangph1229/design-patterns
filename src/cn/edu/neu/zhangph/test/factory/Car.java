package cn.edu.neu.zhangph.test.factory;
import java.util.*;
public class Car implements Moveable{
	private Car(){}
	private static final Car car = new Car();
	private List<Car> cars = new ArrayList<Car>();
	public static Car getInstance(){
		return car;
	}
	public void run(){
		System.out.println("³Û³ÒÔÚÂ·ÉÏ¡£¡£¡£¡£");
	}
}
