package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * 懒汉式单例模式（lazy load）
 * 特点：线程安全，调用效率不高。可以延时加载。
 * @author zhangph
 */
public class SingletonDemo2 {
	
	private SingletonDemo2(){} //私有化构造器
	//类初始化时，不创建对象，等使用时再加载
	private static SingletonDemo2 instance;
	
	//线程安全，调用效率低，但是可以延时加载
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null){
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
