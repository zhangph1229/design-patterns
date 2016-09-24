package cn.edu.neu.zhangph.createpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种单例模式的测试
 * @author zhangph
 *
 */
public class Client3 {
	public static void main(String[] args) throws InterruptedException {
		long start  = System.currentTimeMillis();
		
		int threadNum = 10;
		final CountDownLatch count = new CountDownLatch(threadNum); //加final以后变成常量
		
		for (int i = 0; i < threadNum; i++) {
			
			new Thread(new Runnable(){
				@Override
				public void run() {
					for(int i = 0; i < 1000000; i++){
//						SingletonDemo2.getInstance();
						Object o = SingletonDemo5.INSTANCE;
					}
					count.countDown(); //计数器减一
				}
			}).start();
		}
		count.await();  //循环监测，main线程阻塞，直到计数器为0时，才会跳出往下执行！
		long end  = System.currentTimeMillis();
		System.out.println("time = " + (end - start));
	}
}
