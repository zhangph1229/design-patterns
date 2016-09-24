package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class FaceFilter implements Filters{

	@Override
	public String doFilter(String str) {
		return str.replace(":)","^V^");
	}

}
