package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public class FaceFilter implements Filters{

	@Override
	public void doFilter(Request req, Response res, FilterChain chain) {
		req.resquestString = req.resquestString.replace(":)","^V^");
		chain.doFilter(req, res,chain);
		res.responseString += "------face";
	}


}
