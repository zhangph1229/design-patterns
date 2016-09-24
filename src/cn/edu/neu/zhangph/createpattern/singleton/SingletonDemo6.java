package cn.edu.neu.zhangph.createpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
/**
 * ���Ӧ�Է���ͷ����л�©����
 * @author zhangph
 *
 */
@SuppressWarnings("serial")
public class SingletonDemo6 implements Serializable{
	
	private SingletonDemo6(){
		if(instance != null){
			throw new RuntimeException();
		}
	}
	
	private static SingletonDemo6 instance;
	
	//�̰߳�ȫ������Ч�ʵͣ������ǿ�����ʱ����
	public static synchronized SingletonDemo6 getInstance(){
		if(instance == null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷����ƶ��Ķ��󣬶����ٴ����µĶ���
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
