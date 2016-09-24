package cn.edu.neu.zhangph.behavioralpattern.state;
/**
 * �൱�ڷ�����
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
		System.out.println("���ò�ͬ��״̬");
		this.state = state;
		state.handle();
	}
}
