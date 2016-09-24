package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public class Main {
	public static void main(String[] args) {
		String msg = "Hello,:),<script>, ����ҵ��������Ϣ�������ڿ�";
		Request req = new Request();
		req.setResquestString(msg);
		Response response = new Response();
		response.setResponseString("res");
		FilterChain fc = new FilterChain();
		fc.addFilters(new HTMLFilter())
		 .addFilters(new SenFilter());
		fc.doFilter(req, response, fc);
		System.out.println(req.getResquestString());
		System.out.println(response.getResponseString());
	}
}
