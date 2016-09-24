package cn.edu.neu.zhangph.createpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试反序列化问题
 * @author zhangph
 *
 */
public class Client2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		if(s1 == s2) System.out.println("same");
		SingletonDemo5 s3 = SingletonDemo5.INSTANCE;
		SingletonDemo5 s4 = SingletonDemo5.INSTANCE;
		if(s3 == s4) System.out.println("same");
		
		//通过反射的方式，直接调用私有构造方法
		Class<SingletonDemo6> c = (Class<SingletonDemo6>) Class.forName("cn.edu.neu.zhangph.createpattern.singleton.SingletonDemo6");
		Constructor<SingletonDemo6> clazz = c.getDeclaredConstructor(null);
		clazz.setAccessible(true);
		SingletonDemo6 s5 = clazz.newInstance();
		SingletonDemo6 s6 = clazz.newInstance();
		
		System.out.println(s5==s6);
		
		SingletonDemo6 s7 = SingletonDemo6.getInstance();
		
		//通过反序列化破解单例模式
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s7);
		oos.close();
		fos.close();
		
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		SingletonDemo6 s8 = (SingletonDemo6) ois.readObject();
		
		System.out.println(s7==s8);
		
	}
}
