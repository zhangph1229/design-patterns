package cn.edu.neu.zhangph.structuralpattern.adapter;
/**
 * ÊÊÅäÆ÷£¨ÀàÊÊÅäÆ÷·½Ê½£©
 * @author zhangph
 *
 */
public class Adapter extends Adaptee implements Target{
	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
