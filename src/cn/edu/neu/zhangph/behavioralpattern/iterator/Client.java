package cn.edu.neu.zhangph.behavioralpattern.iterator;

public class Client {
	public static void main(String[] args) {
		MyConcreteMyAggregate maAggregate = new MyConcreteMyAggregate();
		maAggregate.add("aa");
		maAggregate.add("bb");
		maAggregate.add("cc");
		
		MyIterator mIterator = maAggregate.createIterator();
		while(mIterator.hasNext()){
			System.out.println(mIterator.getCurrentObj());
			mIterator.next();
		}
	}
}
