package cn.edu.neu.zhangph.structuralpattern.bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想笔记本电脑
		Computer computer = new Laptop(new Lenove());
		computer.sale();
		
		Computer computer2 = new Desktop(new Dell());
		computer2.sale();
	}
}
