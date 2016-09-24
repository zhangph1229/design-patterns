package cn.edu.neu.zhangph.createpattern.builder;

public interface AirshipBuilder {
	Engine builderEngine();
	OrbitalModule builderModule();
	EscapeTower builderEscapeTower();
}
