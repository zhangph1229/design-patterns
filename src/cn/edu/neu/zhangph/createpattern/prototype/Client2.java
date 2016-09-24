package cn.edu.neu.zhangph.createpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * 原型模式 ---使用序列化方法进行深克隆
 * @author zhangph
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(123450006789L);
		Sheep sheep = new Sheep("多利",date);
		
		System.out.println(sheep);
		System.out.println(sheep.getBirthday());
		
		//使用序列化和反序列化方式实现深克隆
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(sheep);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sheep sheep2 = (Sheep) ois.readObject();
		
		date.setTime(987000654321L);
		System.out.println(sheep.getBirthday());
		System.out.println(sheep2.getBirthday());
		
	}
}
