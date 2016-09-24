package cn.edu.neu.zhangph.structuralpattern.flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		
		System.out.println(chess1);
		System.out.println(chess2);
		
		chess1.display(new Coordinate(10,10));
		chess2.display(new Coordinate(100,100));
		
	}
}
