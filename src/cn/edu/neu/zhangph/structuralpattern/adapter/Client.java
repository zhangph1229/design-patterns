package cn.edu.neu.zhangph.structuralpattern.adapter;
/**
 * ¿Í»§¶ËÀà
 * @author zhangph
 *
 */
public class Client {
	public void test1(Target target){
		target.handleReq();
	}
	public static void main(String[] args) {
		Client client = new Client();
//		Target target = new Adapter();
//		client.test1(target);
		
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter1(adaptee);
		client.test1(target);
		
	}
}
