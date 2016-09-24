package cn.edu.neu.zhangph.createpattern.builder;

public class ConcreteAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构造逃逸塔");
		return new EscapeTower("构造逃逸塔");
	}
	
}
