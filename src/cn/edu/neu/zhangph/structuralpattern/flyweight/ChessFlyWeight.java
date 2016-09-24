package cn.edu.neu.zhangph.structuralpattern.flyweight;

public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		this.color = c;
	}

	@Override
	public void display(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("棋子颜色" + color);
		System.out.println("棋子位置" + c.getX()+"," + c.getY());
	}
	
}
