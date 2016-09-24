package cn.edu.neu.zhangph.structuralpattern.decorator;

public class Client {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
//		
//		System.out.println("���ӷ��й���");
//		FlyCar flyCar = new FlyCar(car);
//		flyCar.move();
//		
//		System.out.println("����ˮ���˶�����");
//		WaterCar wCar = new WaterCar(flyCar);
//		wCar.move();
		
		AICar aiCar = new AICar(new FlyCar(new WaterCar(new Car())));
		aiCar.move();
	}
	
}
