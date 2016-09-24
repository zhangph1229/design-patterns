package cn.edu.neu.zhangph.behavioralpattern.iterator;
/**
 * 自定义迭代器接口
 * @author zhangph
 *
 */
public interface MyIterator {
	void first(); //游标指向第一个元素
	void next(); //指向下一个元素
	boolean hasNext(); 
	boolean isFirst();
	boolean isLast();
	Object getCurrentObj();
}
