package cn.edu.neu.zhangph.createpattern.singleton;

public class AmricaPresident {
	private AmricaPresident(){}
	
	private static final AmricaPresident thePresident = new AmricaPresident();
	
	public static AmricaPresident getPresident(){
		return thePresident;
	}
}
