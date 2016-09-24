package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public class SenFilter implements Filters {


	@Override
	public void doFilter(Request req, Response res , FilterChain chain) {
		
		req.resquestString = req.resquestString.replace("被就业","就业").replace("敏感","");
		chain.doFilter(req, res,chain);
		res.responseString += "------Sen";
	}

}
