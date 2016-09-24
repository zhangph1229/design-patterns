package cn.edu.neu.zhangph.createpattern.prototype;

import java.util.Date;


/**
 * 测试原型模式  prototype （浅克隆）
 * @author zhangph
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(1233444555);
		Sheep s1 = new Sheep("多利", date);
		Sheep s2 = (Sheep) s1.clone();
//		System.out.println(date);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getSname() + "," + s1.getBirthday());
		System.out.println(s2.getSname() + ","+ s2.getBirthday());
		date.setTime(1234556);
//		System.out.println(date);
		
		s2.setSname("少利");
		System.out.println(s1.getSname() + "," + s1.getBirthday());
		System.out.println(s2.getSname() + ","+ s2.getBirthday());
	}
}
