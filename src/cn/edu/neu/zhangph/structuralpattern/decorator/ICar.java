package cn.edu.neu.zhangph.structuralpattern.decorator;
/**
 * �������
 * @author zhangph
 *
 */
public interface ICar {
	void move();
}

//���幹����ɫ
class Car implements ICar{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("½������������");
	}
	
}

//Decorator װ�ν�ɫ
class SuperCar implements ICar{
	
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		car.move();
	}
	
}

class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("�����");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
}
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	public void water(){
		System.out.println("ˮ������");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		water();
	}
	
}
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	public void auto(){
		System.out.println("�Զ���ʻ");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		auto();
	}
	
}
