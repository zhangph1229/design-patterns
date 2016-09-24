package cn.edu.neu.zhangph.createpattern.builder;

public class ConcreteAirshipDirector implements Director{

	private AirshipBuilder builder;
	public ConcreteAirshipDirector( AirshipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public Airship directorAirship() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderModule();
		EscapeTower et = builder.builderEscapeTower();
		
		Airship ship = new Airship();
		ship.setEngine(e);
		ship.setOrbitalModule(o);
		ship.setEscapeTower(et);
		
		return ship;
	}

}
