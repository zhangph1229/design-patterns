package cn.edu.neu.zhangph.structuralpattern.adapter;
/**
 * ��������ʹ����ϵķ�ʽ��
 * @author zhangph
 *
 */
public class Adapter1  implements Target{
	
	private Adaptee adaptee;
	
	public Adapter1(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}
	
}
