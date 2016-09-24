package cn.edu.neu.zhangph.test.ChainOfResponsibility;

public class MessageProcess {
	private String msg;
//	Filters[] filter = {new HTMLFilter(), new SenFilter(), new FaceFilter()};
	FilterChain fc;
	
	public FilterChain getFc() {
		return fc;
	}
	public void setFc(FilterChain fc) {
		this.fc = fc;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String filter(){
		//process the html tag <>
//		String res = null;
//		for(Filters f : filter){
//			res = f.doFilter(msg);
//		}
		return fc.doFilter(msg);
	}
}
