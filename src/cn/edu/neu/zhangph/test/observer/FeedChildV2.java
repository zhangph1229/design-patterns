package cn.edu.neu.zhangph.test.observer;

/**
 * @version V2
 * @author zhangph
 */
class Child2 implements  Runnable{
	private boolean weakUp = false;
	Dad2 d;
	public Child2(Dad2 d){
		this.d = d;
	}
	
	public void weakUp(){
		this.weakUp = true;
	}

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.weakUp();
		d.feed();
	}
}

class Dad2 {
	public void feed(){
		System.out.println("feed child!");
	}
}

public class FeedChildV2 {
	public static void main(String[] args) {
		new Thread(new Child2(new Dad2())).start();
	}
}

