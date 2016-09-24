package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class SenFilter implements Filters {

	@Override
	public String doFilter(String str) {
		//process the sensitive words
		return str.replace("被就业","就业")
				.replace("敏感","");
	}

}
