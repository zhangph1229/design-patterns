package cn.edu.neu.zhangph.behavioralpattern.observer;

public class ConcreteSubject extends Subject{
	private int state;
	public int getSize(){
		return state;
	}
	public void setState(int state){
		this.state = state;
		this.notifyAllObserver();
	}
}
