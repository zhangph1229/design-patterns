package cn.edu.neu.zhangph.createpattern.builder;

public class Airship {
	private OrbitalModule orbitalModule; 
	private Engine engine;
	private EscapeTower escapeTower;
	
	public void lunch(){
		System.out.println("·¢Éä");
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}


}

class OrbitalModule{
	private String name;
	public OrbitalModule(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Engine{
	private String name;
	public Engine(String name) {
		this.name = name;// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class EscapeTower{
	private String name;
	public EscapeTower(String name) {
		this.name = name;// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
