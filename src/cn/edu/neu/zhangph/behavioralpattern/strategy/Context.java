package cn.edu.neu.zhangph.behavioralpattern.strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void printPrice(double p){
		System.out.println("±¨¼Û£º" + strategy.getPrice(p));;
	}
	
}
