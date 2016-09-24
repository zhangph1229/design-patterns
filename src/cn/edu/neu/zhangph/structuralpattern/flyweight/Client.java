package cn.edu.neu.zhangph.structuralpattern.flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("ºÚÉ«");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("ºÚÉ«");
		
		System.out.println(chess1);
		System.out.println(chess2);
		
		chess1.display(new Coordinate(10,10));
		chess2.display(new Coordinate(100,100));
		
	}
}
