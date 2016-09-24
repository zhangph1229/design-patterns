package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * ˫�ؼ����ģʽ��
 * 	������ʽ��ͬ����ŵ�if����
 * @author zhangph
 */

public class SingletonDemo3 {
	private SingletonDemo3(){}
	
	private static final SingletonDemo3 instance = null;
	
	public static synchronized SingletonDemo3 getInstance(){
		if(instance == null){ //ֻ�ڵ�һ��ͬ��ʱ����
			SingletonDemo3 sc;
			synchronized(SingletonDemo3.class){
				sc = instance;
				if(sc == null){
					synchronized(SingletonDemo3.class){
						if(sc == null)
							sc = new SingletonDemo3();
					}
				}
				return sc;
			}
		}
		return instance;
	}
}
