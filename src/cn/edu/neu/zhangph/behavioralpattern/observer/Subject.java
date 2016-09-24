package cn.edu.neu.zhangph.behavioralpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	protected List<Observer> list = new ArrayList<Observer>();
	
	
	public void register(Observer observer ){
		list.add(observer);
	}
	
	public void notifyAllObserver(){
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = list.iterator(); iterator.hasNext();) {
			Observer type = (Observer) iterator.next();
			type.update(this);
			
		}
	}
	
}
