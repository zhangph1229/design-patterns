package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class HTMLFilter implements Filters{

	@Override
	public String doFilter(String str) {
		//process the html tag <>
		return str.replace('<','[').replace('>',']');
	}

}
