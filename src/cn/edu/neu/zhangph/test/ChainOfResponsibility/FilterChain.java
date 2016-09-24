package cn.edu.neu.zhangph.test.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterChain implements Filters{
	List<Filters> list = new ArrayList<Filters>();
	public FilterChain addFilters(Filters f){
		list.add(f);
		return this;
	}
	public String doFilter(String str){
		for(Filters f : list){
			str = f.doFilter(str);
		}
		return str;
	}
}
