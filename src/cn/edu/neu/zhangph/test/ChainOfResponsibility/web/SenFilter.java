package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public class SenFilter implements Filters {


	@Override
	public void doFilter(Request req, Response res , FilterChain chain) {
		
		req.resquestString = req.resquestString.replace("����ҵ","��ҵ").replace("����","");
		chain.doFilter(req, res,chain);
		res.responseString += "------Sen";
	}

}
