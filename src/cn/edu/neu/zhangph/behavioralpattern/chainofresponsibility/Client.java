package cn.edu.neu.zhangph.behavioralpattern.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		Leader directorLeader = new Director("����");
		Leader manageLeader = new Manager("����");
		Leader submanageLeader = new SubManager("����");
		Leader generalLeader = new GeneralManager("����");
		
		directorLeader.setNextLeader(manageLeader);
		manageLeader.setNextLeader(submanageLeader);
		submanageLeader.setNextLeader(generalLeader);
		
		//��ʼ��ٲ���
		LeaveRequest req1 = new LeaveRequest("Tom",15,"��Ӣ���ϼ�̽�ף�");
		directorLeader.handleRequest(req1);
	}
}
