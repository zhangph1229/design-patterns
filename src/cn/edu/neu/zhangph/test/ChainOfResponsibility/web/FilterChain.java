package cn.edu.neu.zhangph.test.ChainOfResponsibility.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterChain implements Filters{
	List<Filters> list = new ArrayList<Filters>();
	int index = 0;
	public FilterChain addFilters(Filters f){
		list.add(f);
		return this;
	}
	@Override
	public void doFilter(Request req, Response res, FilterChain chain) {
		if(index == list.size()) return;
		Filters filter = list.get(index);
		index++;
		filter.doFilter(req, res, chain);
	}
}
