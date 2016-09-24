package cn.edu.neu.zhangph.behavioralpattern.templatemethod;

public abstract class BankTemplateMethod {
	public void takeNumber(){
		System.out.println("ȡ���Ŷ�");
	}
	
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("����");
	}
	
	public final void process(){
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
