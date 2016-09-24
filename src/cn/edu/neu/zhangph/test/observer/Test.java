package cn.edu.neu.zhangph.test.observer;

import java.io.IOException;
import java.util.*;

public class Test {
	public static void main(String[] args){
		String observers = PropertyManage.getProp("observers");
		StringTokenizer stk = new StringTokenizer(observers, ",");
		Child c = new Child();
		new Thread(c).start();
		while (stk.hasMoreTokens()) {
			try {
				c.addWakenUpListener((WakenUpListener) Class.forName(stk.nextToken()).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Child implements Runnable {
	private List<WakenUpListener> listeners = new ArrayList<WakenUpListener>();
	public void addWakenUpListener(WakenUpListener listener) {
		this.listeners.add(listener);
	}
	public void wakeUp() {
		for (int i = 0; i < listeners.size(); i++) {
			listeners.get(i).actionToWakenUp(new WakenUpEvent(System.currentTimeMillis(), "bed", this));
		}
	}
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.wakeUp();
	}
}

interface WakenUpListener {
	public void actionToWakenUp(WakenUpEvent wake);
}

class Parent implements WakenUpListener {
	public void actionToWakenUp(WakenUpEvent wake) {
		System.out.println("该吃饭啦。。。");
	}
}

class GrandFather implements WakenUpListener {
	public void actionToWakenUp(WakenUpEvent wake) {
		System.out.println("抱抱。。。");
	}
}

class Dog implements WakenUpListener{
	public void actionToWakenUp(WakenUpEvent wake) {
		System.out.println("wang,wang,wang。。。");
	}
}

class WakenUpEvent {
	private long time;
	private String loc;
	private Object source;

	public WakenUpEvent(long time, String loc, Object source) {
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

/**
 * 单例模式
 */
class PropertyManage{
	private final static Properties props = new Properties();
	static{
		try {
			props.load(Test.class.getClassLoader()
					.getResourceAsStream("cn/edu/neu/zhangph/test/observer/observer.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public static String getProp(String key){
		return props.getProperty(key);
	}
}
