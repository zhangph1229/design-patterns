package cn.edu.neu.zhangph.test.observer;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TestFrame extends Frame{
	public void launch(){
		Button b = new Button("È·¶¨");
		b.addActionListener(new MaActionListener());
		b.addActionListener(new MaActionListener2());
		
		this.add(b);
		this.pack();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new TestFrame().launch();;
	}
	
	private class MaActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("OK!");
		}
		
	}
	private class MaActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("OK2!");
		}
		
	}
}

