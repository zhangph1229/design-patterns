package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * 静态内部类模式：也是一种懒加载方式
 * 特点：线程安全、调用效率高、懒加载
 * @author zhangph
 */
public class SingletonDemo4 {
	//不需要同步等待，有高效调用的能力，也有延时加载的功能
	private SingletonDemo4(){}
	
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}
