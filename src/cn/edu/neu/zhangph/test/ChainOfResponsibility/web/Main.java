package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public class Main {
	public static void main(String[] args) {
		String msg = "Hello,:),<script>, 被就业，敏感信息，网络授课";
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
