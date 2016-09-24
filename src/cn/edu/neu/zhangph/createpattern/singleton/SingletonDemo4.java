package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * ��̬�ڲ���ģʽ��Ҳ��һ�������ط�ʽ
 * �ص㣺�̰߳�ȫ������Ч�ʸߡ�������
 * @author zhangph
 */
public class SingletonDemo4 {
	//����Ҫͬ���ȴ����и�Ч���õ�������Ҳ����ʱ���صĹ���
	private SingletonDemo4(){}
	
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}
