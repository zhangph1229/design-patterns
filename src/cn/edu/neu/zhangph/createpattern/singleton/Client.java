package cn.edu.neu.zhangph.createpattern.singleton;

public class Client {
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		if(s1 == s2) System.out.println("same");
		SingletonDemo5 s3 = SingletonDemo5.INSTANCE;
		SingletonDemo5 s4 = SingletonDemo5.INSTANCE;
		if(s3 == s4) System.out.println("same");
	}
}
