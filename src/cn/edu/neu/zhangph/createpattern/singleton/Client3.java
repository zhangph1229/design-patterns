package cn.edu.neu.zhangph.createpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ֵ���ģʽ�Ĳ���
 * @author zhangph
 *
 */
public class Client3 {
	public static void main(String[] args) throws InterruptedException {
		long start  = System.currentTimeMillis();
		
		int threadNum = 10;
		final CountDownLatch count = new CountDownLatch(threadNum); //��final�Ժ��ɳ���
		
		for (int i = 0; i < threadNum; i++) {
			
			new Thread(new Runnable(){
				@Override
				public void run() {
					for(int i = 0; i < 1000000; i++){
//						SingletonDemo2.getInstance();
						Object o = SingletonDemo5.INSTANCE;
					}
					count.countDown(); //��������һ
				}
			}).start();
		}
		count.await();  //ѭ����⣬main�߳�������ֱ��������Ϊ0ʱ���Ż���������ִ�У�
		long end  = System.currentTimeMillis();
		System.out.println("time = " + (end - start));
	}
}
