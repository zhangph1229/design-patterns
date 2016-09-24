package cn.edu.neu.zhangph.structuralpattern.proxy.staticproxy;

public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxy = new Proxy();
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();  //ͨ�������������ƺ�����
		proxy.collectMoney();
		
	}
}
