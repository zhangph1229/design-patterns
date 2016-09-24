package cn.edu.neu.zhangph.test.observer.awt;

import java.io.IOException;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		String observer = MyProperty.props.getProperty("observers");
		String[] res = observer.split(",");
		Button b = new Button();
		for (int i = 0; i < res.length; i++) {
			try {
				b.addActionListener((ActionListener) Class.forName(res[i]).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		b.buttonPressed();
	}
}

class Button {
	private List<ActionListener> actionListeners = new ArrayList<ActionListener>();
	
	public void buttonPressed(){
		ActionEvent e = new ActionEvent(System.currentTimeMillis(),this);
		for (int i = 0; i < actionListeners.size(); i++) {
			actionListeners.get(i).actionPerformed(e);
		}
	}
	public void addActionListener(ActionListener l){
		actionListeners.add(l);
	}
}

interface ActionListener {
	void actionPerformed(ActionEvent e);
}

class ActionEvent{
	private long when;
	private Object source;
	public ActionEvent(long when, Object source) {
		this.when = when;
		this.source = source;
	}
	public long getWhen(){
		return when;
	}
	
	public Object getSource(){
		return source;
	}
}

class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK!");
	}
}
class MyActionListene2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK2!");
	}
}

class MyProperty{
	public final static Properties props = new Properties();
	static {
		try {
			props.load(Test.class.getClassLoader().getResourceAsStream("cn/edu/neu/zhangph/test/observer/awt/awt.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getProperty(String key){
		return props.getProperty(key);
	}
}