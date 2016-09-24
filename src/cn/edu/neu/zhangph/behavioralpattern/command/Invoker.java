package cn.edu.neu.zhangph.behavioralpattern.command;

public class Invoker {
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	public void call(){
		command.execute();
	}
}
