package cn.edu.neu.zhangph.createpattern.singleton;

/**
 * ����ʽ����ģʽ
 * �ص㣺�̰߳�ȫ������Ч�ʸߡ����ǣ�������ʱ���ء�
 * @author zhangph
 */
public class SingletonDemo1 {
	
	private SingletonDemo1(){} //˽�л�������
	
	//���ʼ��ʱ���������ض���û����ʱ���ص����ƣ�����ʽ��������������Ȼ���̰߳�ȫ��
	private static final SingletonDemo1 instance = new SingletonDemo1();
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
