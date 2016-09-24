package cn.edu.neu.zhangph.structuralpattern.proxy.dynimicproxy;

import java.lang.reflect.Proxy;


public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		Star proxyStar = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		proxyStar.sing();
//		proxyStar.bookTicket();
//		proxyStar.sing();
	}
}
