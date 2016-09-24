package cn.edu.neu.zhangph.structuralpattern.decorator;

public class Client {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
//		
//		System.out.println("增加飞行功能");
//		FlyCar flyCar = new FlyCar(car);
//		flyCar.move();
//		
//		System.out.println("增加水上运动能力");
//		WaterCar wCar = new WaterCar(flyCar);
//		wCar.move();
		
		AICar aiCar = new AICar(new FlyCar(new WaterCar(new Car())));
		aiCar.move();
	}
	
}
