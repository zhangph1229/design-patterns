package cn.edu.neu.zhangph.behavioralpattern.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		Leader directorLeader = new Director("张三");
		Leader manageLeader = new Manager("李四");
		Leader submanageLeader = new SubManager("赵四");
		Leader generalLeader = new GeneralManager("王五");
		
		directorLeader.setNextLeader(manageLeader);
		manageLeader.setNextLeader(submanageLeader);
		submanageLeader.setNextLeader(generalLeader);
		
		//开始请假操作
		LeaveRequest req1 = new LeaveRequest("Tom",15,"回英国老家探亲！");
		directorLeader.handleRequest(req1);
	}
}
