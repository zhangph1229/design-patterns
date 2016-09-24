package cn.edu.neu.zhangph.behavioralpattern.observer;

public class ObserverA implements Observer{
	private int myState;
	
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		myState = ((ConcreteSubject)subject).getSize();
	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}


}
