package cn.edu.neu.zhangph.structuralpattern.bridge;

public interface Brand {
	void sale();
}

class Lenove implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售联想电脑");
	}
	
}

class Dell implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售戴尔电脑");
	}
	
}