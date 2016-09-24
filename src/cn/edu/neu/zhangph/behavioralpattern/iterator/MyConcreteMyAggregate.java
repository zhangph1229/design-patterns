package cn.edu.neu.zhangph.behavioralpattern.iterator;

import java.util.*;

/**
 * 自定义聚合类
 * @author zhangph
 *
 */

public class MyConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();

	public void add(Object object){
		this.list.add(object);
	}
	public void remove(Object object){
		this.list.remove(object);
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements MyIterator{
		
		private int cursor; //定义游标
		
		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor < list.size()){
				cursor++;
			}else {
				System.out.println("last");
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor < list.size()){
				return true;
			}else return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0 ? true:false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor == list.size() - 1 ? true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
