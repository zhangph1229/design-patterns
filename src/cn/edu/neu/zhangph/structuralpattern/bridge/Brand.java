package cn.edu.neu.zhangph.structuralpattern.bridge;

public interface Brand {
	void sale();
}

class Lenove implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("�����������");
	}
	
}

class Dell implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("���۴�������");
	}
	
}