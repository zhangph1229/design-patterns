package cn.edu.neu.zhangph.test.observer.practice;

import java.io.*;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String res = MyProps.getProps("observers");
		StringTokenizer stk = new StringTokenizer(res, ",");
		Button b = new Button();
		while(stk.hasMoreTokens()){
			try {
				b.addActionListener((AWTActionListener) Class.forName(stk.nextToken()).newInstance());
			} catch (Exception  e) {
				e.printStackTrace();
			}
		}
		b.buttonPressed();
	}
	
}

class Button{
	private List<AWTActionListener> listeners = new ArrayList<AWTActionListener>();
	
	public void addActionListener(AWTActionListener al){
		listeners.add(al);
	}
	
	public void buttonPressed(){
		AWTActionEvent e = new AWTActionEvent(System.currentTimeMillis(),this);
		for (int i = 0; i < listeners.size(); i++) {
			listeners.get(i).actionPerformed(e);
		}
	}
}

interface AWTActionListener{
	public void actionPerformed(AWTActionEvent e);
}

class MuseActionListener implements AWTActionListener{

	@Override
	public void actionPerformed(AWTActionEvent e) {
		System.out.println("This is muse action!");
	}
	
}

class BroadActionListener implements AWTActionListener{

	@Override
	public void actionPerformed(AWTActionEvent e) {
		System.out.println("This is broad action!");
	}
	
}

class AWTActionEvent{

	private long time;
	private Object source;
	public AWTActionEvent(long time, Object source) {
		super();
		this.time = time;
		this.source = source;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	
}

class MyProps{
	private MyProps(){}
	private static final Properties props = new Properties();
	static{
		try {
			props.load(Test2.class.getClassLoader().getResourceAsStream("cn/edu/neu/zhangph/test/observer/practice/awt.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getProps(String key){
		return props.getProperty(key);
	}
}
