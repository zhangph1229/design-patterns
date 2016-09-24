package cn.edu.neu.zhangph.behavioralpattern.command;

public interface Command {
	/**
	 * ִ�н��
	 */
	void execute();
}

class ConcreteCommand implements Command{

	private Receiver receiver ;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}
	
}
