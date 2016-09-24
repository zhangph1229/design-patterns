package cn.edu.neu.zhangph.createpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * ԭ��ģʽ ---ʹ�����л������������¡
 * @author zhangph
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(123450006789L);
		Sheep sheep = new Sheep("����",date);
		
		System.out.println(sheep);
		System.out.println(sheep.getBirthday());
		
		//ʹ�����л��ͷ����л���ʽʵ�����¡
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
