package cn.edu.neu.zhangph.structuralpattern.bridge;

public class Computer {
	protected  Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	public void sale(){
		brand.sale();
	}
}
class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);

	}
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("����̨ʽ��");
	}
	
}
class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
	
}
