package cn.edu.neu.zhangph.test.observer;

import java.util.*;

class Child3 implements  Runnable{
	private List<WeakUpListener> list = new ArrayList<WeakUpListener>();
	public void addWeakUpListers(WeakUpListener l){
		list.add(l);
	}
	public void weakUp(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			((WeakUpListener) it.next()).actionPerform(new WeakenUpEvent(System.currentTimeMillis(), "bad", this));
		}
	}

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.weakUp();
	}
}

class Dad3 implements WeakUpListener{
	public void actionPerform(WeakenUpEvent event) {
		System.out.println("his dad");
	}
}
class GF implements WeakUpListener{
	public void actionPerform(WeakenUpEvent event) {
		System.out.println("his gf");
	}
}

interface WeakUpListener{
	public void actionPerform(WeakenUpEvent event);
}


class WeakenUpEvent{
	private long time ;
	private String loc;
	private Object source;  //发生事件的源对象
	public WeakenUpEvent(long time, String loc, Object source) {
		super();
		this.time = time;
		this.loc = loc;
		this.source = source;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Object getSource() {
		return source;
	}
	public void setSource(Object source) {
		this.source = source;
	}
	
}

public class FeedChildV3 {
	public static void main(String[] args) {
		Dad3 d = new Dad3();
		GF gf = new GF();
		Child3 c = new Child3();
		c.addWeakUpListers(d);
		c.addWeakUpListers(gf);
		new Thread(c).start();
	}
}
