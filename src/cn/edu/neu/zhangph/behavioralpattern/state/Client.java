package cn.edu.neu.zhangph.behavioralpattern.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new FreeState());
		context.setState(new BookedState());
	}
}
