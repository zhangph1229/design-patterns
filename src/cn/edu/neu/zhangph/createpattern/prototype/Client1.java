package cn.edu.neu.zhangph.createpattern.prototype;

import java.util.*;

/**
 * 原型模式 ---深克隆
 * @author zhangph
 *
 */
public class Client1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(123450006789L);
		Sheep1 sheep1 = new Sheep1("多利",date);
		Sheep1 sheep12 = (Sheep1) sheep1.clone();
		
		System.out.println(sheep1.getBirthday());
		System.out.println(sheep12.getBirthday());
		
		date.setTime(987000654321L);
		System.out.println(sheep1.getBirthday());
		System.out.println(sheep12.getBirthday());
		
	}
}
