package cn.edu.neu.zhangph.behavioralpattern.command;

public interface Command {
	/**
	 * Ö´ÐÐ½á¹û
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
