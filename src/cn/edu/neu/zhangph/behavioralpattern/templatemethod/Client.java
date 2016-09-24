package cn.edu.neu.zhangph.behavioralpattern.templatemethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("我要存钱了");
			}
		};
		btm2.process();
		
		new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("先取钱，再存钱，理财就不用了");
			}
		}.process();
	}
}


