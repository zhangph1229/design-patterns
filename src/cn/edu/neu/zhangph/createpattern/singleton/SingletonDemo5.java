package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * 枚举实现单例模式
 * 特点：避免了反射和反序列化，没有懒加载
 * @author zhangph
 */
public enum SingletonDemo5 {
	//这个枚举元素本身就是单例模式
	INSTANCE;
	//添加自己的功能处理
	public static void SingletonOperation(){
		System.out.println();
	}
}
