package cn.edu.neu.zhangph.behavioralpattern.iterator;
/**
 * �Զ���������ӿ�
 * @author zhangph
 *
 */
public interface MyIterator {
	void first(); //�α�ָ���һ��Ԫ��
	void next(); //ָ����һ��Ԫ��
	boolean hasNext(); 
	boolean isFirst();
	boolean isLast();
	Object getCurrentObj();
}
