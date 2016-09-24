package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * 双重检测锁模式：
 * 	把懒汉式的同步块放到if里面
 * @author zhangph
 */

public class SingletonDemo3 {
	private SingletonDemo3(){}
	
	private static final SingletonDemo3 instance = null;
	
	public static synchronized SingletonDemo3 getInstance(){
		if(instance == null){ //只在第一次同步时进入
			SingletonDemo3 sc;
			synchronized(SingletonDemo3.class){
				sc = instance;
				if(sc == null){
					synchronized(SingletonDemo3.class){
						if(sc == null)
							sc = new SingletonDemo3();
					}
				}
				return sc;
			}
		}
		return instance;
	}
}
