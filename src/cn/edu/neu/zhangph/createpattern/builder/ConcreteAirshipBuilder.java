package cn.edu.neu.zhangph.createpattern.builder;

public class ConcreteAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("����������");
		return new Engine("������");
	}

	@Override
	public OrbitalModule builderModule() {
		System.out.println("���������");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("����������");
	}
	
}
