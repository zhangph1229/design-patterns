package cn.edu.neu.zhangph.createpattern.prototype;

public class Client4 {
	
	public static void testNew(int size){
		long start  = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop t = new Laptop();
		}
		long  end = System.currentTimeMillis();
		System.out.println("new ºÄÊ±£º " + (end - start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
		long start  = System.currentTimeMillis();
		Laptop t = new Laptop();
		for (int i = 0; i < size; i++) {
			Laptop temp = (Laptop) t.clone();
		}
		long  end = System.currentTimeMillis();
		System.out.println("clone ºÄÊ±£º " + (end - start));
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);
		testClone(1000);
	}
}

class Laptop implements Cloneable{
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}