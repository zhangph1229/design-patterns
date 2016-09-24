package cn.edu.neu.zhangph.behavioralpattern.state;

public interface State {
	void handle();
}

class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("空闲状态");
	}
	
}

class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订");
	}
	
}
class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住");
	}
	
}