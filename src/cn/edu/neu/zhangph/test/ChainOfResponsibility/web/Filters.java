package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

public interface Filters {
	void doFilter(Request req, Response res, FilterChain chain);
}
