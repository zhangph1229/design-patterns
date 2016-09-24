package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * 饿汉式单利模式
 * 特点：线程安全，调用效率高。但是，不能延时加载。
 * @author zhangph
 */
public class SingletonDemo1 {
	
	private SingletonDemo1(){} //私有化构造器
	
	//类初始化时，立即加载对象，没有延时加载的优势（饿汉式）。加载类是天然的线程安全。
	private static final SingletonDemo1 instance = new SingletonDemo1();
	
	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
