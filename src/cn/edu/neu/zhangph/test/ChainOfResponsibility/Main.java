package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		String msg = "Hello,:),<script>, 被就业，敏感信息，网络授课";
		MessageProcess f = new MessageProcess();
		f.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilters(new HTMLFilter())
		 .addFilters(new SenFilter());
		FilterChain fc1 = new FilterChain();
		fc1.addFilters(new FaceFilter());
		fc.addFilters(fc1);
		f.setFc(fc);
		String res = f.filter();
		System.out.println(res);
	}
}
