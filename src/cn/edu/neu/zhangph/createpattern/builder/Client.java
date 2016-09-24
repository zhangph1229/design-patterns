package cn.edu.neu.zhangph.createpattern.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new ConcreteAirshipDirector(new ConcreteAirshipBuilder());
		Airship ship = director.directorAirship();
		System.out.println(ship.getEngine().getName());
		ship.lunch();
	}
}
