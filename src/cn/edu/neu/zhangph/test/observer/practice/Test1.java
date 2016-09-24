package cn.edu.neu.zhangph.test.observer.practice;

import java.io.IOException;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		String props = MyProperty.getProperty("observers");
		StringTokenizer stk = new StringTokenizer(props, ",");
		Child c = new Child();
		while(stk.hasMoreTokens()){
			try {
				c.addActionEvent((ActionListener) Class.forName(stk.nextToken()).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		new Thread(c).start();
	}
}
class Child implements Runnable{
	private List<ActionListener> listeners = new ArrayList<ActionListener>();
	
	public void addActionEvent(ActionListener al){
		listeners.add(al);
	}
	public void wakeUp(){
		for (int i = 0; i < listeners.size(); i++) {
			listeners.get(i).actionProformed(new ActionEvent(this, "sky", System.currentTimeMillis()));
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

interface ActionListener{
	public void actionProformed(ActionEvent ae);
}

class Parent implements ActionListener{

	@Override
	public void actionProformed(ActionEvent ae) {
		System.out.println("feed baobao!");
	}
	
}
class GrandParent implements ActionListener{

	@Override
	public void actionProformed(ActionEvent ae) {
		System.out.println("play football!");
	}
	
}

class ActionEvent{
	private Object al;


	private String loc;
	private long time;
	
	public ActionEvent(Object al, String loc, long time) {
		super();
		this.al = al;
		this.loc = loc;
		this.time = time;
	}

	public Object getSource(){
		return al;
	}
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}

class MyProperty{
	private final static Properties props = new Properties();
	static {
		try {
			props.load(Test1.class.getClassLoader().getResourceAsStream("cn/edu/neu/zhangph/test/observer/practice/observer.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key){
		return props.getProperty(key);
	}
}
