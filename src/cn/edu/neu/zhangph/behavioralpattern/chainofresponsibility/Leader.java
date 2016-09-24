package cn.edu.neu.zhangph.behavioralpattern.chainofresponsibility;

public abstract class Leader {
	protected String nameString;
	protected Leader nextLeader;
	public Leader(String nameString) {
		super();
		this.nameString = nameString;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	public abstract void handleRequest(LeaveRequest leaveRequest);
}

class Director extends Leader{

	public Director(String nameString) {
		super(nameString);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() < 3){
			System.out.println("员工"+leaveRequest.getEmpname()+
					"请假，天数："+leaveRequest.getLeaveDays()+
					" 理由：" + leaveRequest.getReason());
			System.out.println("主任：" + this.nameString + "审批通过");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}
	
}

class Manager extends Leader{

	public Manager(String nameString) {
		super(nameString);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() < 10){
			System.out.println("员工"+leaveRequest.getEmpname()+
					"请假，天数："+leaveRequest.getLeaveDays()+
					" 理由：" + leaveRequest.getReason());
			System.out.println("经理：" + this.nameString + "审批通过");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}
}

//新添加副总
class SubManager extends Leader{

	public SubManager(String nameString) {
		super(nameString);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() < 20){
			System.out.println("员工"+leaveRequest.getEmpname()+
					"请假，天数："+leaveRequest.getLeaveDays()+
					" 理由：" + leaveRequest.getReason());
			System.out.println("副总经理：" + this.nameString + "审批通过");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(leaveRequest);
			}
		}
	}
}

class GeneralManager extends Leader{

	public GeneralManager(String nameString) {
		super(nameString);
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() < 30){
			System.out.println("员工"+leaveRequest.getEmpname()+
					"请假，天数："+leaveRequest.getLeaveDays()+
					" 理由：" + leaveRequest.getReason());
			System.out.println("总经理：" + this.nameString + "审批通过");
		}else{
			System.out.println("你不想干了吧");
		}
	}
}

