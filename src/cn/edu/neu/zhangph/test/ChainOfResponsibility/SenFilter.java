package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class SenFilter implements Filters {

	@Override
	public String doFilter(String str) {
		//process the sensitive words
		return str.replace("����ҵ","��ҵ")
				.replace("����","");
	}

}
