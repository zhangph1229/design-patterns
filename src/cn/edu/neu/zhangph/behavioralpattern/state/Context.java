package cn.edu.neu.zhangph.behavioralpattern.state;
/**
 * 相当于房间类
 * @author zhangph
 *
 */
public class Context {
	private State state;
	
	
	public Context(State state) {
		super();
		this.state = state;
		state.handle();
	}


	public void setState(State state){
		System.out.println("设置不同的状态");
		this.state = state;
		state.handle();
	}
}
