package cn.edu.neu.zhangph.behavioralpattern.templatemethod;

public class DrawMoney extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("ȡ��ҵ��");
	}

}
