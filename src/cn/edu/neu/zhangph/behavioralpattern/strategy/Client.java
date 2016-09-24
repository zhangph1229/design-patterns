package cn.edu.neu.zhangph.behavioralpattern.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy s1 = new NewCustomerFewStrategy();
		Context context = new Context(s1);
		context.printPrice(1000);
		
		Context context2 = new Context(new OldCustomerMaxStrategy());
		context2.printPrice(1000);
	}
}
