package cn.edu.neu.zhangph.test.observer;
/**
 * @version V1
 * @author zhangph
 *
 */
class Child1 implements  Runnable{
	private boolean weakUp = false;
	public void weakUp(){
		this.weakUp = true;
	}
	
	public boolean isWeakUp() {
		return weakUp;
	}

	public void setWeakUp(boolean weakUp) {
		this.weakUp = weakUp;
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

class Dad1 implements Runnable{
	Child1 c;
	public Dad1(Child1 c){
		this.c = c;
	}
	@Override
	public void run() {
		while(!c.isWeakUp()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		feed();
	}
	private void feed(){
		System.out.println("feed child!");
	}
}

public class FeedChildV1 {
	public static void main(String[] args) {
		Child1 d = new Child1();
		new Thread(d).start();
		new Thread(new Dad1(d)).start();
	}
}
