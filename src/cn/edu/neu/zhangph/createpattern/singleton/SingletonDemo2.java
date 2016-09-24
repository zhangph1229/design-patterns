package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * ����ʽ����ģʽ��lazy load��
 * �ص㣺�̰߳�ȫ������Ч�ʲ��ߡ�������ʱ���ء�
 * @author zhangph
 */
public class SingletonDemo2 {
	
	private SingletonDemo2(){} //˽�л�������
	//���ʼ��ʱ�����������󣬵�ʹ��ʱ�ټ���
	private static SingletonDemo2 instance;
	
	//�̰߳�ȫ������Ч�ʵͣ����ǿ�����ʱ����
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null){
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
