package cn.edu.neu.zhangph.createpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
/**
 * 如何应对反射和反序列化漏洞？
 * @author zhangph
 *
 */
@SuppressWarnings("serial")
public class SingletonDemo6 implements Serializable{
	
	private SingletonDemo6(){
		if(instance != null){
			throw new RuntimeException();
		}
	}
	
	private static SingletonDemo6 instance;
	
	//线程安全，调用效率低，，但是可以延时加载
	public static synchronized SingletonDemo6 getInstance(){
		if(instance == null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//反序列化时，如果定义了readResolve()则直接返回此方法制定的对象，而不再创建新的对象。
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
