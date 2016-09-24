package cn.edu.neu.zhangph.behavioralpattern.templatemethod;

public abstract class BankTemplateMethod {
	public void takeNumber(){
		System.out.println("È¡ºÅÅÅ¶Ó");
	}
	
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("ÆÀÂÛ");
	}
	
	public final void process(){
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
