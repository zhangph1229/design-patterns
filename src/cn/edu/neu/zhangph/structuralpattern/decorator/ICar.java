package cn.edu.neu.zhangph.structuralpattern.decorator;
/**
 * 抽象组件
 * @author zhangph
 *
 */
public interface ICar {
	void move();
}

//具体构建角色
class Car implements ICar{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("陆地上能跑啦！");
	}
	
}

//Decorator 装饰角色
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
		System.out.println("会飞啦");
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
		System.out.println("水里游啦");
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
		System.out.println("自动驾驶");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		auto();
	}
	
}
