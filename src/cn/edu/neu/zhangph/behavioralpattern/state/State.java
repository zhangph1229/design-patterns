package cn.edu.neu.zhangph.behavioralpattern.state;

public interface State {
	void handle();
}

class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("����״̬");
	}
	
}

class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("������Ԥ��");
	}
	
}
class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("��������ס");
	}
	
}