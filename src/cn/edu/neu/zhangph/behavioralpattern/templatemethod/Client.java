package cn.edu.neu.zhangph.behavioralpattern.templatemethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ��");
			}
		};
		btm2.process();
		
		new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("��ȡǮ���ٴ�Ǯ����ƾͲ�����");
			}
		}.process();
	}
}


