package cn.edu.neu.zhangph.structuralpattern.adapter;
/**
 * ������������������ʽ��
 * @author zhangph
 *
 */
public class Adapter extends Adaptee implements Target{
	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
